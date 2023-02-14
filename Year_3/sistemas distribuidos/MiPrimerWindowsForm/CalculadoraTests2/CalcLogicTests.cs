using Xunit;
using Calculadora;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FluentAssertions;

namespace Calculadora.Tests
{
    public class CalcLogicTests
    {
        [Theory()]
        [InlineData(3, 4, 7)]
        [InlineData(5, 0, 5)]
        [InlineData(-9, -4, -13)]
        [InlineData(5, -4, 1)]
        public void SumaTestTheory(float op1, float op2, float expectedResult)
        {
            //Arrange
            iCalcLogic calculadora = new CalcLogic();
            //Act
            var result= calculadora.Suma(op1, op2);
            //Assert
            result.Should().Be(expectedResult);
        }
    }
}   