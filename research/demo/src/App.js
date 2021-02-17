import React from "react";
import { motion } from "framer-motion";
import "./index.css";

export default function App() {
  const [isActive, setIsActive] = React.useState(false);
  return (
    <motion.div
      className="block"
      onClick={() => setIsActive(!isActive)}
      animate={{
        rotate: isActive ? 200 : 360
      }}
    >
      Hello Framer motion
    </motion.div>
  );
}

