import  "../../css/ItemCard.css"
import {Link} from "react-router-dom";
import Modal from '../modal/Modal';
import {useState} from 'react';


const MeatCard = function({ meat, setIndividualMeat, user}) {

    const [isOpen, setIsOpen] = useState(false)
   
    const getMeatDetails = () => {
        fetch("http://localhost:8080/items/item/" + meat.id)
        .then(res => res.json())
        .then(returnedData => setIndividualMeat(returnedData))
    }

    const showImage = meat.image

    const addToBasket = () => {
        user.basket.push(meat);
        setIsOpen(true)
        setInterval(()=> {
            setIsOpen(false)
        },1000)
    }

    return(
        <div className="card">
            
                <Link to="/meatdetails">
                    <img onClick={getMeatDetails} className="item-image"src={showImage}/>
                </Link>

                <h4 className="item-name">{meat.name}</h4>
                <p>£{meat.price}</p>

                <Link to="/meatdetails">
                    <button onClick={getMeatDetails} className="item-buttons">Details</button>
                </Link>
                
                <button 
                onClick={addToBasket} 
                className="item-buttons">Add to Basket</button>

                <Modal open={isOpen}>
                    Added to basket!
                </Modal>
                
            </div>
        
    )
}

export default MeatCard;