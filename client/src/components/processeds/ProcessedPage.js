import {useState, useEffect} from 'react'
import FilterForm from "../auxillary/FilterForm";
import ProcessedList from "./ProcessedList";

const ProcessedPage = function({processedData, setIndividualProcessed, user}){

    const [filteredProcessed, setFilteredProcessed] = useState([]);

    useEffect(()=> {
        setFilteredProcessed(processedData)
    }, [processedData])

    const filterData = (searchTerm) => {
        console.log(searchTerm);
        if(searchTerm) {
            const someProcessed = processedData.filter((item) => {
                return item.type.toUpperCase().includes(searchTerm.toUpperCase())
            });
            setFilteredProcessed(someProcessed)
        } else {
            setFilteredProcessed(processedData)
        }
    }

    return (
        <div>
            <FilterForm filterData={filterData}/>
            <ProcessedList processedData = {filteredProcessed} setIndividualProcessed={setIndividualProcessed} user={user}/>
        </div>
    )
}

export default ProcessedPage;