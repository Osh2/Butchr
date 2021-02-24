import {useState} from 'react';
import { unstable_concurrentAct } from 'react-dom/test-utils';
import '../css/Login.css'

const LoginPage = ({user, setUser}) => {

    const [userInput, setUserInput] = useState("");
    
    const handleFetch = (event) =>{
        event.preventDefault()
        fetch("http://localhost:8080/users/" + userInput)
        .then(res => res.json())
        .then(returnedUser => setUser(returnedUser))
    }

    const handleNameChange = (event) => {
        event.preventDefault();
        user.name = event.target.value;
    }

    const handleAddressChange = (event) => {
        event.preventDefault();
        user.address = event.target.value;
    }

    const handleNumChange = (event) => {
        event.preventDefault();
        user.teleNum = event.target.value
    }

    const handleAgeChange = (event) =>  {
        event.preventDefault();
        user.age = event.target.value;
    }

    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body:  JSON.stringify ({user}),
        mode: "no-cors"
    }

    const createUser = (event) => {
        event.preventDefault();
        fetch('http://localhost:8080/users/', 
        {method: 'POST',
        body: JSON.stringify(user),
        headers: { 'Content-Type': 'application/json' }
    })
    .then(res => res.json())
    .then(data => setUser(data))
    }


    const createUserForm = () => {
        if(user.name === "NULL"){
            return(
                <div id="form-page">
                    <h3> Please enter your details </h3>
                    <form onSubmit={createUser} className="userForms">


                    <label for="name"> N A M E </label>
                        <input className="signupFormItem" type="text" placeholder="Name" required onChange={handleNameChange}/>  
                        <br></br>


                        <label for="email"> A D D R E S S </label>
                        <input className="signupFormItem" type="text" placeholder="Address" required onChange={handleAddressChange}/>
                        <br></br>


                        <label for="email"> E M A I L </label>
                        <input className="signupFormItem" type="text" value={user.email} required/>
                        <br></br>


                        <label for="email"> N U M B E R </label>
                        <input className="signupFormItem" type="text" placeholder="Telephone Number" required onChange={handleNumChange}/>
                        <br></br>
                        <button className="submitUser" type="submit" > C R E A T E  A C C O U N T </button>
                    </form>
                </div>
            )
        }
    }
        
    const handleChange = (event) => {
        event.preventDefault();
        setUserInput(event.target.value)
    }

    //we want to render the rest of the form inputs to allow the user to input their information to create their account IF the fetch on their email returns nothing. 

    return (
        <div className="login">
            <h1> Welcome to Butchr ya bish </h1>

            <form id="login" onSubmit={handleFetch}>
                
                <input type="text" className="email-input" placeholder="Please enter your email" onClick={handleChange} onChange={handleChange}/>
                <button className="submitLogin" type="submit">S U B M I T </button>
            </form>
            {createUserForm()}
        </div>
    )
}

export default LoginPage;