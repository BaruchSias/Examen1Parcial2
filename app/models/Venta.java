package models;

import java.util.Date;
import javax.persistence.Entity;
import play.db.jpa.Model;
import play.modules.mongo.*;

/**
 *
 * @author Baruch
 */

//db.Venta

@Entity
public class Venta extends Model {

    public Date fecha;
    public float total;
    public Integer folio;

    @MongoEntity("DetalleVenta")
    public class DetalleVenta extends MongoModel {

        public String producto;
        public Integer cantidad;
        public float precio;

    }
}
