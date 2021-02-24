import App from "../../App";
import Modal from '../modal/Modal';
import {useState} from 'react';


const MeatDetails = ({user, individualMeat}) => {

    const [isOpen, setIsOpen] = useState(false)

        const addToBasket = () => {
            user.basket.push (individualMeat)
            setIsOpen(true)
            setInterval(()=> {
                setIsOpen(false)
            },1000)
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
            <Modal open={isOpen}>
                    Added to basket!
            </Modal>
        </div>
    )
}

export default MeatDetails;