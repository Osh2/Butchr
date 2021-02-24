import {useEffect, useState} from 'react';
import FilterForm from "../auxillary/FilterForm";
import NonFoodList from "../nonFoodItems/NonFoodList";

const NonFoodPage = ({nonFoodData, setIndivdualNonFoodItem, user}) => {

    const [filteredEquip, setFilteredEquip] = useState([]);

    useEffect(()=> {
        setFilteredEquip(nonFoodData)
    }, [nonFoodData])

    const filterData = (searchTerm) => {
        if(searchTerm) {
            const someEquip = nonFoodData.filter((item) => {
                return item.type.toUpperCase().includes(searchTerm.toUpperCase())
            });
            setFilteredEquip(someEquip)
        } else {
            setFilteredEquip(nonFoodData)
        }
    }

     return (
         <div>
             <FilterForm filterData={filterData}/>
            <NonFoodList nonFoodData={filteredEquip} setIndivdualNonFoodItem={setIndivdualNonFoodItem} user={user} />
         </div>
     )
}

export default NonFoodPage;