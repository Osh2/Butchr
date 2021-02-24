import {useState} from 'react'

const FilterForm = ({filterData}) => {

    const [filterKeyword, setFilterKeyword] = useState("")

    const handleChange = (event) => {
        setFilterKeyword(event.target.value)
        filterData(event.target.value)
    }

    return (
        <div>
            <input onChange={handleChange} type="text" value={filterKeyword} placeholder="Filter Keywords" />
        </div>
    )
}

export default FilterForm;