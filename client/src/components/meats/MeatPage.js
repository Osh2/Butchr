import {useState, useEffect} from 'react'
import MeatList from "./MeatList"
import FilterForm from "../auxillary/FilterForm"

const MeatPage = function({meatData, setIndividualMeat, user}) {
    
    const [filteredMeats, setFilteredMeats] = useState([]);

    useEffect(()=> {
        setFilteredMeats(meatData)
    }, [meatData])

    const filterData = (searchTerm) => {
        console.log(searchTerm);
        if(searchTerm) {
            const someMeats = meatData.filter((meat) => {
                return meat.type.toUpperCase().includes(searchTerm.toUpperCase())
            });
            setFilteredMeats(someMeats)
        } else {
            setFilteredMeats(meatData)
        }
    }
    
    return (
        <div>
            <FilterForm filterData={filterData} />
            <MeatList  meatData={filteredMeats} user={user} setIndividualMeat={setIndividualMeat}/>
        </div>
    )
}

export default MeatPage;