import  "../../css/ItemCard.css"
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
    }


    return(
        <div className="card">
                <Link to="/meatdetails">
                    <img className="item-image"src={showImage}/>
                </Link>

                <h4 className="item-name">{meat.name}</h4>
                <p>£{meat.price}</p>

                <Link to="/meatdetails"><button onClick={getMeatDetails} className="item-buttons"
                >Details</button></Link>

                <button onClick={addToBasket} className="item-buttons">Add to Basket</button>
            </div>
        
    )
}

export default MeatCard;