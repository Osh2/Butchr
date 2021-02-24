import userEvent from "@testing-library/user-event";
import App from "../../App";
import Modal from '../modal/Modal';
import {useState} from 'react';


const NonFoodDetails = ({user, individualNonFoodItem}) => {

    const showImage = individualNonFoodItem.image

    const addToBasket = () => {
        user.basket.push (individualNonFoodItem);
        setIsOpen(true)
        setInterval(()=> {
            setIsOpen(false)
        },1000)
    }

    const [isOpen, setIsOpen] = useState(false)

    return( 
        <div className="itemDetails">
            <img height="350rem" src={showImage}/>
            <h4>{individualNonFoodItem.name}</h4>
            <p>{individualNonFoodItem.type}</p>
            <p>£{individualNonFoodItem.price}</p>
            <p>{individualNonFoodItem.description}</p>
            <p>{individualNonFoodItem.manufacturer}</p>
            <button onClick={addToBasket}>Add to Basket</button>
            <Modal open={isOpen}>
                    Added to basket!
            </Modal>
        </div>
    )
}

export default NonFoodDetails;