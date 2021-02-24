import App from "../../App";

const ProcessedDetails = ({user, individualProcessed}) => {

    const addToBasket = () => {
        user.basket.push ( individualProcessed);
        
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
            <h4>Allergens:</h4>
            <ul>
                {individualProcessed.allergens}
                
            </ul>

        </div>
    )
}

export default ProcessedDetails;