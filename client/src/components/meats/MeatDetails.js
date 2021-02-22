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
        {/* // <div id="meatDetails"> */}
            <img height="350rem" src={showImage}/>
            <h1>{individualMeat.name}</h1>
            <p>{individualMeat.description}</p>
            <p>{individualMeat.cut}</p>
            <p>{individualMeat.type}</p>
            <p>£{individualMeat.price}</p>
            <button onClick={addToBasket}>Add to Basket</button>
        </div>
    )
}

export default MeatDetails;