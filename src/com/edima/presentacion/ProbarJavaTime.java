package com.edima.presentacion;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.LocalTime;

public class ProbarJavaTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1992, 8, 30);
        System.out.println("fecha ->" + date);

        LocalDate date2 = LocalDate.of(1992, Month.AUGUST, 30);
        System.out.println("fecha ->" + date2);
        LocalDate date3 = LocalDate.parse("1992-08-30");
        System.out.println("fecha ->" + date3);

        System.out.println(date.plusDays(2));
        System.out.println(date.plusMonths(1));
        System.out.println(date.plusYears(1));
        System.out.println(date.minusDays(2));
        System.out.println(date.minusMonths(1));
        System.out.println(date.minusYears(1));

        LocalDate date4 = LocalDate.of(2007, Month.AUGUST, 7);
        System.out.println(date2.isBefore(date4));
        System.out.println(date2.isAfter(date4));

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now());

        System.out.println(Period.between(date2,date4).getYears());
        System.out.println(Period.between(date2,date4).getYears());

//        Primera forma de armar tiempos
        LocalTime horaInicio = LocalTime.of(12,0);
        System.out.println("horaInicio -> " + horaInicio);
        LocalTime horaFin = LocalTime.parse("12:00:00.001");
        System.out.println(horaFin);

        System.out.println(horaInicio.plusHours(1));
        System.out.println(horaInicio.minusMinutes(1));
        System.out.println(horaInicio.isBefore(horaFin));


        //Definir una fecha de fabricación y una fecha de expiración
        //Calcular los días, meses, años para que caduque


        LocalDate fechaDeFabricacion = LocalDate.of(1986, Month.AUGUST, 7);
        LocalDate fechaDeExpiration = LocalDate.of(1996, Month.AUGUST, 7);
        Period periodo = Period.between(fechaDeFabricacion, fechaDeExpiration);
        System.out.println("Periodo de validez ->" + periodo.getYears());
        System.out.println("Periodo de validez ->" + periodo.getMonths());
        System.out.println("Periodo de validez ->" + periodo.getDays());





    }

    }

