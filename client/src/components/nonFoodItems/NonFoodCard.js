import {Link} from "react-router-dom";

const NonFoodCard = ({nonFood, setIndivdualNonFoodItem}) => {


    const getNonFoodDetails = () => {
        fetch("http://localhost:8080/items/item/" + nonFood.id)
        .then(res => res.json())
        .then(returnedData => setIndivdualNonFoodItem(returnedData))
    }
    
    const showImage = nonFood.image

    return (
        <div className="nonFoodCard">
            <img src={showImage} />
            <h5>{nonFood.name}</h5>
            <h5>{nonFood.type}</h5>
            <p>£{nonFood.price}</p>
            <Link to="/nonfooddetails"><button onClick={getNonFoodDetails}>Details</button></Link>
        </div>
    )
}

export default NonFoodCard;