import App from "../../App";
import Modal from '../modal/Modal';
import {useState} from 'react';

const ProcessedDetails = ({user, individualProcessed}) => {

    const [isOpen, setIsOpen] = useState(false)


    const addToBasket = () => {
        user.basket.push ( individualProcessed);
        setIsOpen(true)
        setInterval(()=> {
            setIsOpen(false)
        },1000)
        
    }
    console.log(individualProcessed);

    const showImage = individualProcessed.image

    return (
        <div className="itemDetails">
            <img height="350rem" src={showImage}/>
            <h4>{individualProcessed.name}</h4>
            <p>{individualProcessed.type}</p>
            <p>£{individualProcessed.price}</p>
            <p>{individualProcessed.description}</p>
            <p>{individualProcessed.ingredients}</p>
            <button onClick={addToBasket} className="item-buttons">Add to Basket</button>
            <Modal open={isOpen}>
                    Added to basket!
            </Modal>
            <h4>Allergens:</h4>
            <ul>
                {individualProcessed.allergens}
                
            </ul>
        </div>
    )
}

export default ProcessedDetails;