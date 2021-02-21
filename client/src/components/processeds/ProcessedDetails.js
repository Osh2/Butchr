const ProcessedDetails = ({individualProcessed}) => {

    console.log(individualProcessed.allergens);

    let getAllergens; 
    if(individualProcessed){
        getAllergens = individualProcessed.allergens.map((allergen) => {
            return (
            <li key={allergen}>{allergen}</li> 
            )}
        )
    }


    return (
        <div id="processedDetails">
            <h1>{individualProcessed.name}</h1>
            <p>{individualProcessed.type}</p>
            <p>£{individualProcessed.price}</p>
            <p>{individualProcessed.description}</p>
            <p>{individualProcessed.ingredients}</p>
            <h4>Allergens:</h4>
            <ul>
                {getAllergens}
            </ul>

        </div>
    )
}

export default ProcessedDetails;