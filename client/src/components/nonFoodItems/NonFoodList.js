import NonFoodCard from "../nonFoodItems/NonFoodCard";

const NonFoodList = ({nonFoodData, setIndivdualNonFoodItem, user}) => {

    const nonFoodJSX = nonFoodData.map((item) => {
        return (
            <NonFoodCard 
            nonFood = {item}
            setIndivdualNonFoodItem={setIndivdualNonFoodItem}
            user={user}
            key = {item.id}
            /> 
        )
    })

    return (
        <div id="nonFoodList">
            {nonFoodJSX}
        </div>
    )
}

export default NonFoodList;