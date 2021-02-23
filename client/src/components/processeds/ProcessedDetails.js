import userEvent from "@testing-library/user-event";
import App from "../../App";

const ProcessedDetails = ({user, individualProcessed}) => {

    const addToBasket = () => {
        user.basket.push ( individualProcessed);

    }

    // let getAllergens; 
    // if(individualProcessed){
    //     getAllergens = individualProcessed.allergens.map((allergen) => {
    //         return (
    //         <li key={allergen}>{allergen}</li> 
    //         )}
    //     )
    // }

    const showImage = individualProcessed.image

    return (
        <div className="itemDetails">
        {/* <div id="processedDetails"> */}
            <img height="350rem" src={showImage}/>
            <h4>{individualProcessed.name}</h4>
            <p>{individualProcessed.type}</p>
            <p>£{individualProcessed.price}</p>
            <p>{individualProcessed.description}</p>
            <p>{individualProcessed.ingredients}</p>
            <button onClick={addToBasket} className="item-buttons">Add to Basket</button>
            <h4>Allergens:</h4>
            <ul>
                {/* {getAllergens} */}
            </ul>

        </div>
    )
}

export default ProcessedDetails;