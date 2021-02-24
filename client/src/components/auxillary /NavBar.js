import {Link} from "react-router-dom";
import '../../css/Basket.css'
import {useState} from 'react';

import isDeepEqual from 'fast-deep-equal/react';

const NavBar = ({user}) => {

    const [basket, setBasketCount] = useState(user.basket);

    if(!isDeepEqual(user.basket, basket)){
        setBasketCount(user.basket)
    }

    return(
        <div id="navBar">
            <Link to="/" className="nav-items">Home</Link>
            <Link to="/meat" className="nav-items"> Fresh Cuts </Link>
            <Link to="/processed" className="nav-items"> Processed Products </Link>
            <Link to="/nonfood" className="nav-items"> Utensils and Equipment  </Link>

            <Link to="/basket" className="nav-items">  
                <span id='cartCount'> 
                {user.basket.length}
                 </span>
                <i class="fa" id="cart-icon">&#xf07a;</i>
            </Link>

        </div>
    )
}

export default NavBar;