import {useState} from 'react';

const LoginPage = ({setUser}) => {

    const [userInput, setUserInput] = useState("");
    

    const handleSubmit = (event) =>{
        event.preventDefault()
        fetch("http://localhost:8080/users/" + userInput)
        .then(res => res.json())
        .then(returneredUser => setUser(returneredUser))
    }
        

    const handleChange = (event) => {
        event.preventDefault();
        setUserInput(event.target.value)
        console.log(userInput);
    }

    return (
        <div>

            <h1> Welcome to Butchr ya bish </h1>

            <form id="userLogin" onSubmit={handleSubmit}>

                <input type="text" name="email" placeholder="Please enter your email" onClick={handleChange} onChange={handleChange}/>

                <button type="submit">Submit</button>

            </form>

        </div>
    )
}

export default LoginPage;