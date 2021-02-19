const NonFoodCard = ({nonFood}) => {

    return (
        <>
        <h5>{nonFood.name}</h5>
        <h5>{nonFood.type}</h5>
        <h5>{nonFood.description}</h5>
        <h5>{nonFood.price}</h5>
        <h5>{nonFood.manufacturer}</h5>
        </>
    )
}

export default NonFoodCard;