import NonFoodCard from "../nonFoodItems/NonFoodCard";

const NonFoodList = ({nonFoodData, setIndivdualNonFoodItem}) => {

    const nonFoodJSX = nonFoodData.map((item) => {
        return (
            <NonFoodCard 
            nonFood = {item}
            setIndivdualNonFoodItem={setIndivdualNonFoodItem}
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