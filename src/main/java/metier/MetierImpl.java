package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")

public class MetierImpl implements IMetier{
    private IDao dao=null;

    public MetierImpl(@Qualifier ("dao2")IDao dao) {
        this.dao = dao;
    }

    //public MetierImpl(DaoImpl d) {
    //}

    @Override
    public double calcul() {
        double t= dao.getData();
        double res=t*23;
        return res;
    }
//pour injecter dans dao un objet dune classe qui implemente IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
