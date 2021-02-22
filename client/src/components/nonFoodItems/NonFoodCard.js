import {Link} from "react-router-dom";

const NonFoodCard = ({nonFood, setIndivdualNonFoodItem, user }) => {


    const getNonFoodDetails = () => {
        fetch("http://localhost:8080/items/item/" + nonFood.id)
        .then(res => res.json())
        .then(returnedData => setIndivdualNonFoodItem(returnedData))
    }
    
    const showImage = nonFood.image

    const addToBasket = () => {
        user.basket.push(nonFood);
        console.log(user);
    }

    return (
        <div className="nonFoodCard">
            <img height="150rem" src={showImage} />
            <h5>{nonFood.name}</h5>
            <h5>{nonFood.type}</h5>
            <p>£{nonFood.price}</p>
            <Link to="/nonfooddetails"><button onClick={getNonFoodDetails}>Details</button></Link>
            <button onClick={addToBasket}>Add to Basket</button>
        </div>
    )
}

export default NonFoodCard;