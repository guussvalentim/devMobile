package test;

import control.CalculadoraImc;


import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class teste {

	CalculadoraImc calc;
	
	@Before
	public void setup() {
		calc = new CalculadoraImc();
	}
	
	// testes adulto
	
    @Test
    public void testcalcularImc_BaixoPesoMuitoGrave() {
        String esperado = "Baixo peso muito grave";
        String resultado = calc.calcularImc(1.621, 42, 20, "masculino");
        assertEquals(esperado, resultado);
    }

    @Test
    public void testcalcularImc_BaixoPesoGrave_LimInf() {
        String esperado = "Baixo peso grave";
        String resultado = calc.calcularImc(1.62, 42, 20, "masculino");
        assertEquals(esperado, resultado);
    }

    @Test
    public void testcalcularImc_BaixoPesoGrave_LimSup() {
        String esperado = "Baixo peso grave";
        String resultado = calc.calcularImc(1.5535, 41, 20, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_BaixoPeso_LimInf() {
        String esperado = "Baixo peso";
        String resultado = calc.calcularImc(1.5902, 43, 20, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_BaixoPeso_LimSup() {
        String esperado = "Baixo peso";
        String resultado = calc.calcularImc(1.5945, 47, 20, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_PesoNormal_LimInf() {
        String esperado = "Peso normal";
        String resultado = calc.calcularImc(1.6438, 50, 20, "masculino");
        assertEquals(esperado, resultado);
    }

    @Test
    public void testcalcularImc_PesoNormal_LimSup() {
        String esperado = "Peso normal";
        String resultado = calc.calcularImc(1.68557, 71, 20, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_Sobrepeso_LimInf() {
        String esperado = "Sobrepeso";
        String resultado = calc.calcularImc(1.6852, 71, 20, "masculino");
        assertEquals(esperado, resultado);
    }

    @Test
    public void testcalcularImc_Sobrepeso_LimSup() {
        String esperado = "Sobrepeso";
        String resultado = calc.calcularImc(1.68355, 85, 20, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_ObesidadeGrau1_LimInf() {
        String esperado = "Obesidade grau I";
        String resultado = calc.calcularImc(1.6832, 85, 20, "masculino");
        assertEquals(esperado, resultado);
    }

    @Test
    public void testcalcularImc_ObesidadeGrau1_LimSup() {
        String esperado = "Obesidade grau I";
        String resultado = calc.calcularImc(1.7075, 102, 20, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_ObesidadeGrau2_LimInf() {
        String esperado = "Obesidade grau II";
        String resultado = calc.calcularImc(1.7071, 102, 20, "masculino");
        assertEquals(esperado, resultado);
    }

    @Test
    public void testcalcularImc_ObesidadeGrau2_LimSup() {
        String esperado = "Obesidade grau II";
        String resultado = calc.calcularImc(1.6958, 115, 20, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_ObesidadeGrau3() {
        String esperado = "Obesidade grau III";
        String resultado = calc.calcularImc(1.6955, 115, 20, "masculino");
        assertEquals(esperado, resultado);
    }

    // testes idoso
    
    @Test
    public void testcalcularImc_feminino_baixoPeso() {
        String esperado = "Baixo peso";
        String resultado = calc.calcularImc(1.6929, 63, 66, "feminino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_feminino_pesoNormal_LimInf() {
        String esperado = "Peso normal";
        String resultado = calc.calcularImc(1.727, 66, 65, "feminino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_feminino_pesoNormal_LimSup() {
        String esperado = "Peso normal";
        String resultado = calc.calcularImc(1.689, 77, 66, "feminino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_feminino_sobrepeso_LimInf() {
        String esperado = "Sobrepeso";
        String resultado = calc.calcularImc(1.69609, 78, 66, "feminino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_feminino_sobrepeso_LimSup() {
        String esperado = "Sobrepeso";
        String resultado = calc.calcularImc(1.6009, 82, 66, "feminino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_feminino_obesidadeGrau1_LimInf() {
        String esperado = "Obesidade grau I";
        String resultado = calc.calcularImc(1.72, 95, 66, "feminino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_feminino_obesidadeGrau1_LimSup() {
        String esperado = "Obesidade grau I";
        String resultado = calc.calcularImc(1.5597, 90, 66, "feminino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_feminino_obesidadeGrau2_LimInf() {
        String esperado = "Obesidade grau II";
        String resultado = calc.calcularImc(1.608, 96, 66, "feminino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_feminino_obesidadeGrau2_LimSup() {
        String esperado = "Obesidade grau II";
        String resultado = calc.calcularImc(1.7322, 126, 66, "feminino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_feminino_obesidadeGrau3() {
        String esperado = "Obesidade grau III";
        String resultado = calc.calcularImc(1.7295, 126, 66, "feminino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_masculino_baixoPeso() {
        String esperado = "Baixo peso";
        String resultado = calc.calcularImc(1.679, 62, 66, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_masculino_pesoNormal_LimInf() {
        String esperado = "Peso normal";
        String resultado = calc.calcularImc(1.701, 64, 66, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_masculino_pesoNormal_LimSup() {
        String esperado = "Peso normal";
        String resultado = calc.calcularImc(1.678, 76, 66, "masculino");
        assertEquals(esperado, resultado);
    }

    @Test
    public void testcalcularImc_masculino_sobrepeso_LimInf() {
        String esperado = "Sobrepeso";
        String resultado = calc.calcularImc(1.685, 77, 66, "masculino");
        assertEquals(esperado, resultado);
    }
    
    
    @Test
    public void testcalcularImc_masculino_sobrepeso_LimSup() {
        String esperado = "Sobrepeso";
        String resultado = calc.calcularImc(1.703, 87, 66, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_masculino_obesidadeGrau1_LimInf() {
        String esperado = "Obesidade grau I";
        String resultado = calc.calcularImc(1.709, 88, 66, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_masculino_obesidadeGrau1_LimSup() {
        String esperado = "Obesidade grau I";
        String resultado = calc.calcularImc(1.6905, 100, 66, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_masculino_obesidadeGrau2_LimInf() {
        String esperado = "Obesidade grau II";
        String resultado = calc.calcularImc(1.687, 100, 66, "masculino");
        assertEquals(esperado, resultado);
    }

    @Test
    public void testcalcularImc_masculino_obesidadeGrau2_LimSup() {
        String esperado = "Obesidade grau II";
        String resultado = calc.calcularImc(1.703, 116, 66, "masculino");
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testcalcularImc_masculino_obesidadeGrau3() {
        String esperado = "Obesidade grau III";
        String resultado = calc.calcularImc(1.8005, 130, 66, "masculino");
        System.out.println(resultado);
        assertEquals(esperado, resultado);
    }

}
