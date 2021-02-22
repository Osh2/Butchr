import App from "../../App";


const NonFoodDetails = ({individualNonFoodItem}) => {

    const showImage = individualNonFoodItem.image


    return( 
        <div className="itemDetails">
        {/* <div id="nonFoodDetails"> */}
            <img height="350rem" src={showImage}/>
            <h1>{individualNonFoodItem.name}</h1>
            <p>{individualNonFoodItem.type}</p>
            <p>£{individualNonFoodItem.price}</p>
            <p>{individualNonFoodItem.description}</p>
            <p>{individualNonFoodItem.manufacturer}</p>
        </div>
    )
}

export default NonFoodDetails;