import {Link} from "react-router-dom";
import {useState} from "react";
import Modal from '../modal/Modal';

const ProcessedCard = function ({ processed, setIndividualProcessed, user }) {

    const [isOpen, setIsOpen] = useState(false)
    
    const getProcessedDetails = () => {
        fetch("http://localhost:8080/items/item/" + processed.id)
        .then(res => res.json())
        .then(returnedData => setIndividualProcessed(returnedData))
    }

    const showImage = processed.image;

    const addToBasket = () => {
        user.basket.push(processed);
        setIsOpen(true)
        setInterval(()=> {
            setIsOpen(false)
        },1000)
    }

    return (
        <div className="card">
            <Link to="/processeddetails">
                <img onClick={getProcessedDetails} src = {showImage} className="item-image"/>
            </Link>

            <h4 className="item-name" >{processed.name}</h4>
            <p>£{processed.price}</p>

            <Link to="/processeddetails"><button onClick={getProcessedDetails} className="item-buttons" >Details</button></Link>

            <button onClick={addToBasket} className="item-buttons" >Add to Basket</button>

            <Modal open={isOpen}>
                    Added to basket!
            </Modal>

        </div>
    )

}


export default ProcessedCard;