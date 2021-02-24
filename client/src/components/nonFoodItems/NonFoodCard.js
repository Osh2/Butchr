import {Link} from "react-router-dom";
import Modal from '../modal/Modal';
import {useState} from 'react';

const NonFoodCard = ({nonFood, setIndivdualNonFoodItem, user }) => {


    const [isOpen, setIsOpen] = useState(false)

    const getNonFoodDetails = () => {
        fetch("http://localhost:8080/items/item/" + nonFood.id)
        .then(res => res.json())
        .then(returnedData => setIndivdualNonFoodItem(returnedData))
    }
    
    const showImage = nonFood.image

    const addToBasket = () => {
        user.basket.push(nonFood);
        setIsOpen(true)
        setInterval(()=> {
            setIsOpen(false)
        },1000)
    }

    return (
        <div className="card">
            <Link to="/nonfooddetails">
                <img onClick={getNonFoodDetails} className="item-image" src={showImage} />
            </Link>

            <h4 className="item-name" >{nonFood.name}</h4>
            <p>£{nonFood.price}</p>

            <Link to="/nonfooddetails"><button onClick={getNonFoodDetails}className="item-buttons">Details</button></Link>

            <button onClick={addToBasket}className="item-buttons">Add to Basket</button>
            
            <Modal open={isOpen}>
                    Added to basket!
            </Modal>
        </div>
    )
}

export default NonFoodCard;