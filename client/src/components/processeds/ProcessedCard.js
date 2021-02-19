const ProcessedCard = function ({ processed, setIndividualProcessed }) {

    const getAllergens = processed.allergens.map((allergen) => {
        return (
            <li>{allergen}</li>
        )  
    })

    
    const getProcessedDetails = () => {
        fetch("http://localhost:8080/items/item/" + processed.id)
        .then(res => res.json())
        .then(returnedData => setIndividualProcessed(returnedData))
    }


    return (
        <>
        <h4>{processed.name}</h4>
        <h5>{processed.type}</h5>
        <h5>£{processed.price}</h5>
        <h5>{processed.description}</h5>
        <h5>{processed.ingredients}</h5>

        <h5>Allergens:</h5>
        <ul>
        {getAllergens}  
        </ul>
        <button onClick={getProcessedDetails}>Details</button>
        </>
    )

}


export default ProcessedCard;