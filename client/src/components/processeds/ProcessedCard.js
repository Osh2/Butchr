import {Link} from "react-router-dom";

const ProcessedCard = function ({ processed, setIndividualProcessed }) {

    // const getAllergens = processed.allergens.map((allergen) => {
    //     return (
    //         <li key={allergen}>{allergen}</li>
    //     )  
    // })

    
    const getProcessedDetails = () => {
        fetch("http://localhost:8080/items/item/" + processed.id)
        .then(res => res.json())
        .then(returnedData => setIndividualProcessed(returnedData))
    }

    const showImage = processed.image;

    return (
        <div className="processedCard">
            <img src = {showImage} />
            <h4>{processed.name}</h4>
            <h5>{processed.type}</h5>
            <h5>£{processed.price}</h5>
            <Link to="/processeddetails"><button onClick={getProcessedDetails}>Details</button></Link>
        </div>
    )

}


export default ProcessedCard;