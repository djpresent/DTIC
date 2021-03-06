package ucuenca.registrocapacitaciones;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class evaluacion implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "EVALUACION_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "EVALUACION_ID_GENERATOR", sequenceName = "EVALUACION_ID_SEQ")
   private java.lang.Long id;

   @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = { javax.persistence.CascadeType.ALL })
   private ucuenca.registrocapacitaciones.evento evento;



   private java.lang.Integer preg_1_1;

   private java.lang.Integer preg_1_2;

   private java.lang.Integer preg_1_3;

   private java.lang.Integer preg_1_4;

   private java.lang.Integer preg_1_5;

   private java.lang.String preg_2;

   private java.lang.String preg_3;

   private java.lang.String preg_4;

   private java.lang.String preg_5;

   public evaluacion()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public ucuenca.registrocapacitaciones.evento getEvento()
   {
      return this.evento;
   }

   public void setEvento(ucuenca.registrocapacitaciones.evento evento)
   {
      this.evento = evento;
   }



   public java.lang.Integer getPreg_1_1()
   {
      return this.preg_1_1;
   }

   public void setPreg_1_1(java.lang.Integer preg_1_1)
   {
      this.preg_1_1 = preg_1_1;
   }

   public java.lang.Integer getPreg_1_2()
   {
      return this.preg_1_2;
   }

   public void setPreg_1_2(java.lang.Integer preg_1_2)
   {
      this.preg_1_2 = preg_1_2;
   }

   public java.lang.Integer getPreg_1_3()
   {
      return this.preg_1_3;
   }

   public void setPreg_1_3(java.lang.Integer preg_1_3)
   {
      this.preg_1_3 = preg_1_3;
   }

   public java.lang.Integer getPreg_1_4()
   {
      return this.preg_1_4;
   }

   public void setPreg_1_4(java.lang.Integer preg_1_4)
   {
      this.preg_1_4 = preg_1_4;
   }

   public java.lang.Integer getPreg_1_5()
   {
      return this.preg_1_5;
   }

   public void setPreg_1_5(java.lang.Integer preg_1_5)
   {
      this.preg_1_5 = preg_1_5;
   }

   public java.lang.String getPreg_2()
   {
      return this.preg_2;
   }

   public void setPreg_2(java.lang.String preg_2)
   {
      this.preg_2 = preg_2;
   }

   public java.lang.String getPreg_3()
   {
      return this.preg_3;
   }

   public void setPreg_3(java.lang.String preg_3)
   {
      this.preg_3 = preg_3;
   }

   public java.lang.String getPreg_4()
   {
      return this.preg_4;
   }

   public void setPreg_4(java.lang.String preg_4)
   {
      this.preg_4 = preg_4;
   }

   public java.lang.String getPreg_5()
   {
      return this.preg_5;
   }

   public void setPreg_5(java.lang.String preg_5)
   {
      this.preg_5 = preg_5;
   }

   public evaluacion(java.lang.Long id,
         ucuenca.registrocapacitaciones.evento evento,
        
         java.lang.Integer preg_1_1, java.lang.Integer preg_1_2,
         java.lang.Integer preg_1_3, java.lang.Integer preg_1_4,
         java.lang.Integer preg_1_5, java.lang.String preg_2,
         java.lang.String preg_3, java.lang.String preg_4,
         java.lang.String preg_5)
   {
      this.id = id;
      this.evento = evento;
      
      this.preg_1_1 = preg_1_1;
      this.preg_1_2 = preg_1_2;
      this.preg_1_3 = preg_1_3;
      this.preg_1_4 = preg_1_4;
      this.preg_1_5 = preg_1_5;
      this.preg_2 = preg_2;
      this.preg_3 = preg_3;
      this.preg_4 = preg_4;
      this.preg_5 = preg_5;
   }

}