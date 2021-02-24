import userEvent from "@testing-library/user-event";
import App from "../../App";


const MeatDetails = ({user, individualMeat}) => {

        const addToBasket = () => {
            user.basket.push (individualMeat)
        }

    const showImage = individualMeat.image

    console.log(individualMeat);
    return (
        <div className="itemDetails">
            <img height="350rem" src={showImage}/>
            <h4>{individualMeat.name}</h4>
            <p>{individualMeat.description}</p>
            <p>{individualMeat.cut}</p>
            <p>{individualMeat.type}</p>
            <p>£{individualMeat.price}</p>
            <button onClick={addToBasket} className="item-buttons">Add to Basket</button>
        </div>
    )
}

export default MeatDetails;