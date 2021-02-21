import { useState, useEffect } from "react";
import {BrowserRouter as Router, Switch, Route, Link} from "react-router-dom"
import HomePage from "../components/auxillary /HomePage"
import MeatPage from "../components/meats/MeatPage";
import ProcessedPage from "../components/processeds/ProcessedPage";
import NonFoodPage from "../components/nonFoodItems/NonFoodPage";
import MeatDetails from "../components/meats/MeatDetails";
import NonFoodDetails from "../components/nonFoodItems/NonFoodDetails";
import ProcessedDetails from "../components/processeds/ProcessedDetails";
import NavBar from "../components/auxillary /NavBar";

const ButchrContainer = function() {

    const [meatData, setMeatData] = useState([]);
    const [processedData, setProcessedData] = useState([]);
    const [nonFoodData, setNonFoodData] = useState([]);

    const [individualMeat, setIndividualMeat] = useState({});
    const [individualProcessed, setIndividualProcessed] = useState({});
    const [individualNonFoodItem, setIndivdualNonFoodItem] = useState({});

    const getMeatData = () => {
        fetch("http://localhost:8080/items/meat")
        .then(res => res.json())
        .then(returnedData => setMeatData(returnedData));
    }
    
    const getProcessedData = () => {
        fetch("http://localhost:8080/items/processed")
        .then(res => res.json())
        .then(returnedData => setProcessedData(returnedData));
    }

    const getNonFoodItemData = () => {
        fetch("http://localhost:8080/items/non_food_items")
        .then(res => res.json())
        .then(returnedData => setNonFoodData(returnedData));
    }


    useEffect(()=>{
        getMeatData();
        getProcessedData();
        getNonFoodItemData();
    }, [])

    return(

        <Router  >
            <h1> Welcome to Butchr </h1>
            <NavBar/>
            <Route exact path = "/" component={HomePage} />
            <Switch >
            <Route path ="/meat" render={(props) => <MeatPage {...props} meatData={meatData} setIndividualMeat={setIndividualMeat} />} /> 
            <Route path ="/processed" render={(props) => <ProcessedPage {...props} processedData = {processedData} setIndividualProcessed={setIndividualProcessed} />} />
            <Route path ="/nonFood" render={(props) => <NonFoodPage nonFoodData={nonFoodData} setIndivdualNonFoodItem={setIndivdualNonFoodItem} /> } />
            <Route path="/meatdetails" render={(props) => <MeatDetails individualMeat={individualMeat} />} />
            <Route path="/nonfooddetails" render={(props) => <NonFoodDetails individualNonFoodItem={individualNonFoodItem} />} />
            <Route path ="/processeddetails" render={(props) => <ProcessedDetails individualProcessed={individualProcessed} /> } />
            </Switch>
         </Router>
    )
}

export default ButchrContainer;