import MeatPage from "../../css/MeatPage.css"
import {Link} from "react-router-dom";


const MeatCard = function({ meat, setIndividualMeat, user}) {


    const getMeatDetails = () => {
        fetch("http://localhost:8080/items/item/" + meat.id)
        .then(res => res.json())
        .then(returnedData => setIndividualMeat(returnedData))
    }

    const showImage = meat.image

    const addToBasket = () => {
        user.basket.push(meat);
        console.log(user);
    }


    return(
        <div className="meatCard">
                <img height="150rem" src={showImage}/>
                <h4>{meat.name}</h4>
                <h5>{meat.type}</h5>
                <h5>£{meat.price}</h5>
                <Link to="/meatdetails"><button onClick={getMeatDetails}>Details</button></Link>
                <button onClick={addToBasket}>Add to Basket</button>
    
            </div>
        
    )
}

export default MeatCard;