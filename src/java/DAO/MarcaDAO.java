
package DAO;

import Config.Conexion;
import Intefaces.CRUD;
import Entidad.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarcaDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Marca p=new Marca();
    
    @Override
    public List listar() {
        ArrayList<Marca>list=new ArrayList<>();
        String sql="select * from persona";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Marca per=new Marca();
                per.setMarca_id(rs.getInt("Id"));
                per.setMarca_nombre(rs.getString("Nombre"));
                list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Marca list(int marca_id) {
        String sql="select * from persona where marca_id="+marca_id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                p.setMarca_id(rs.getInt("Id"));
                p.setMarca_nombre(rs.getString("Nombre"));
                
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Marca m) {
       String sql="insert into marca(Nombres)values("+m.getMarca_nombre()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Marca m) {
        String sql="update marca set Nombre='Nombres='"+m.getMarca_nombre()+"'where marca_id="+m.getMarca_id();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int marca_id) {
        String sql="delete from marca where marca_id="+marca_id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
