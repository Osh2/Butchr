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
    }

    return (
        <div className="card">
            <Link to="/processeddetails">
                <img onClick={getProcessedDetails} src = {showImage} className="item-image"/>
            </Link>

            <h4 className="item-name" >{processed.name}</h4>
            <p>£{processed.price}</p>

            <Link to="/processeddetails"><button onClick={getProcessedDetails} className="item-buttons" >Details</button></Link>

            <button onClick={addToBasket} className="item-buttons" >Add to Basket</button>
        </div>
    )

}


export default ProcessedCard;