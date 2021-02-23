import {Link} from "react-router-dom"
import {useState} from 'react';
import '../../css/Basket.css'

const NavBar = ({user}) => {

    // const displayCartCount = user.basket.map((item) => {
    //     return (user.basket.length)
    // })

    return(
        <div id="navBar">
            <Link to="/" className="nav-items">Home</Link>
            <Link to="/meat" className="nav-items"> Fresh Cuts </Link>
            <Link to="/processed" className="nav-items"> Processed Products </Link>
            <Link to="/nonfood" className="nav-items"> Utensils and Equipment  </Link>

            <Link to="/basket" className="nav-items">  
                {/* <span id='cartCount'> 
                {displayCartCount()}
                 </span> */}
                <i class="fa" id="cart-icon">&#xf07a;</i>
            </Link>

        </div>
    )
}

export default NavBar;