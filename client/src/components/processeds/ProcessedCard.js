const ProcessedCard = function ({ processed }) {

    const getAllergens = processed.allergens.map((allergen) => {
        return (
        
            <li>{allergen}</li>
        )
        
    })



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
       
        </>
    )

}


export default ProcessedCard;