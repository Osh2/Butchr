import NonFoodList from "../nonFoodItems/NonFoodList";

const NonFoodPage = ({nonFoodData, setIndivdualNonFoodItem, user}) => {
     return (
         <>
            <NonFoodList nonFoodData={nonFoodData} setIndivdualNonFoodItem={setIndivdualNonFoodItem}
            user={user}
            />
         </>
     )
}

export default NonFoodPage;