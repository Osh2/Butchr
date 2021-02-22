import {Link} from "react-router-dom";

const ProcessedCard = function ({ processed, setIndividualProcessed, user }) {

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

    const addToBasket = () => {
        user.basket.push(processed);
        console.log(user);
    }

    return (
        <div className="processedCard">
            <img src = {showImage} />
            <h4>{processed.name}</h4>
            <h5>{processed.type}</h5>
            <h5>£{processed.price}</h5>
            <Link to="/processeddetails"><button onClick={getProcessedDetails}>Details</button></Link>
            <button onClick={addToBasket}>Add to Basket</button>
        </div>
    )

}


export default ProcessedCard;