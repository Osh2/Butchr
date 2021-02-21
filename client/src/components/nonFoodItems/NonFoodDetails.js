const NonFoodDetails = ({individualNonFoodItem}) => {

    return( 
        <div id="nonFoodDetails">
            <h1>{individualNonFoodItem.name}</h1>
            <p>{individualNonFoodItem.type}</p>
            <p>£{individualNonFoodItem.price}</p>
            <p>{individualNonFoodItem.description}</p>
            <p>{individualNonFoodItem.manufacturer}</p>
        </div>
    )
}

export default NonFoodDetails;