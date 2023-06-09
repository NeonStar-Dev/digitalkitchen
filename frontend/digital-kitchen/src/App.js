import HomePage from './components/pages/HomePage';
import SearchPage from './components/pages/SearchPage';
import CreateRecipePage from './components/pages/CreateRecipePage';
import './styles/App.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Navbar from './components/navbar'

function App() {
  return (
    <Router>
      <Navbar/>
      <Routes>
        <Route path="/" >
          <Route index element={<HomePage />} />
          <Route path="/create" element={<CreateRecipePage />} />
          <Route path="/search" element={<SearchPage />} />
        </Route>
      </Routes>
    </Router>
  );
}

export default App;