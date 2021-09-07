import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        {/* espaçamento na vertical de 3px */}
        <h1 className="text-primary py-3">Dashboard Vendas</h1>

        {/* espaçamento na horizontal de 3px */}
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxas de sucesso (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxas de sucesso</h5>
            <DonutChart />
          </div>

          <div className="py-3">
            <h2 className="text-primary">
              Listagem de vendas
            </h2>
          </div>

        </div>

        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
