package models;

import java.util.Date;
import javax.persistence.Entity;
import play.db.jpa.Model;
import play.modules.mongo.*;

/**
 *
 * @author Baruch
 */

//db.DetalleVenta

@Entity
public class DetalleVenta extends Model {

    public String producto;
    public Integer cantidad;
    public float precio;

    @MongoEntity("Venta")
    public class Venta extends MongoModel {

        public Date fecha;
        public float total;
        public Integer folio;

    }
}
