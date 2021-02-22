import NonFoodCard from "../nonFoodItems/NonFoodCard";
import App from "../../App";

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
        <div className="itemList">
            {nonFoodJSX}
        </div>

    )
}

export default NonFoodList;