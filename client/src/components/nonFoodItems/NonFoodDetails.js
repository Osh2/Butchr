import userEvent from "@testing-library/user-event";
import App from "../../App";


const NonFoodDetails = ({user, individualNonFoodItem}) => {

    const showImage = individualNonFoodItem.image
    const addToBasket = () => {
        user.basket.push (individualNonFoodItem);
    }

    return( 
        <div className="itemDetails">
        {/* <div id="nonFoodDetails"> */}
            <img height="350rem" src={showImage}/>
            <h1>{individualNonFoodItem.name}</h1>
            <p>{individualNonFoodItem.type}</p>
            <p>£{individualNonFoodItem.price}</p>
            <p>{individualNonFoodItem.description}</p>
            <p>{individualNonFoodItem.manufacturer}</p>
            <button onClick={addToBasket}>Add to Basket</button>
        </div>
    )
}

export default NonFoodDetails;