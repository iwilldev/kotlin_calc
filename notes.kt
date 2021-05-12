/*

	INTRODUÇÃO AO ANDROID
	
		- SO para dispositivos móveis mantido pela Google desde 2005
		- Mais de 2.5 bilhões de usuários ativos
		- Presente em mais de 24 mil modelos de dispositivos diferentes
		- Automóveis, vestíveis, TV, geladeiras e até espelhos
		- Última versão disponível: Android 11 (09/2020)
		
	Desenvolvimento Híbrido - uma code base para diversos dispositivos
		Dificulta a utilização de alguns sensores e recursos nativos dos dispositivos
		Dart (Flutter), JavaScript (React Native), C# (Xamarin)
	
	Desenvolvimento Nativo - code base específica para o dispositivo/sistema
		Java, Kotlin

	Documentação Desenvolvimento Android
	https://developer.android.com/
		
	Documentação Kotlin para Android
	https://developer.android.com/kotlin

	'Kotlin First'
	
	INTRODUÇÃO AO KOTLIN
	
		- Criada pela JetBrains em 2011, atualmente mantida pela Kotlin Foundation
		- Linguagem multiplataforma, orientada a objetos e funcional
		- Gratuita e de código aberto
		- Nome em homenagem a ilha russa, Kotlin
		
	Estrutura da linguagem
	
		- Não utiliza ponto e vírgula
		- Não possui operador ternário tradicional
		- Type Safe e null Safe
		- Inferência de tipo
		- ...
	
	Aplicabilidade
	
		- Android Nativo
		- Mobile Multiplataforma (KMM)
		- Front-End Web com Kotlin/JS
		- Frameworks
			- Kvison
			- Fritz2
		- Backend com target node.js do Kotlin/JS
		
	Vantagens
	
		- Segura, estruturada, menos verbosa, mais otimizada, grande relevância no mercado
		- Interoperabilidade com o Java
		- Smart Casts (antes da execução há verificação de tipagem e erros) e null safety
		- Android é Kotlin First
		
	Kotlin + Android
		
		- 2016: Primeira versão estável do Kotlin é liberada
		- 2017: Google anuncia suporte ao Kotlin para desenvolvimento Android
		- 2018: Segunda linguagem preferida dos desenvolvedores
		- 2019: Google anuncia que Kotlin é a nova linguagem oficial para desenvolvimento Android
		
	E o Java?
	
		- Não tem suporte a projetos de várias plataformas e Jetpack Compose (UI Declarativa)
		- Continua tendo suporte, mas se tornou linguagem secundária
		
	Resumo
	
		- Linguagem oficial para Android, desde 2019
		- Em desenvolvimento desde 2011
		- Possui diversas vantagens como null check e type safe
		- É 100% interoperável com Java
		- Também desenvolve front-end e back-end com Kotlin/JS e multiplataformas com KMM

*/

// Tipos de Dados

	// Todos os números são signed
	
		Byte int8
		Short int16
		Int int32 
		Long int64
		Float binary32
		Double binary64
		
		Array array
		Boolean boolean
		Char utf16
		String charArray
		Null!
		
		// .MAX_VALUE e .MIN_VALUE para limites positivo e negativo dos tipos numéricos
	
	// Conversão de tipos
	
		toByte()
		toShort()
		toInt()
		toLong()
		toFloat()
		toDouble()
		toChar()

	// Declaração de Variável
	
	/*
	
		var - Valor mutável. CamelCase
			Pode ter seu valor alterado durante o código

			var nome = valor // inferência de tipo
			var nome:Tipo = valor
			var nome:Tipo? = valor ou null
		
		val - Valor Imutável. CamelCase
			Constante que terá somente o valor atribuído
			
		const val - Valor imutável. SNAKE_CASE
			Constante cujo valor é atribuído durante compilação. Escopo global
			
		Variáveis não podem ser declaradas sem tipagem ou sem valor atribuído
	
	*/

// Nullability
	
	/*
	
		Qualquer tipo pode ser nulo, desde que isso esteja explícito na declaração (?).
		
		var month:Int? = null // Atribui valor null a month
		var day:Int = null // Erro de compilação. Int não pode ser null
		
		Inferência de tipo não atribui nullability.
	
	*/

// Operadores Aritméticos
	
	/*
	
		Função		Expressão	Comando	Atribuição

		Soma		a + b		a.plus(b)	a += b
		Subtração	a - b		a.minus(b)	a -= b
		Multiplicação	a * b		a.times(b)	a *= b
		Divisão	a / b		a.div(b)	a /= b
		Resto		a % b		a.mod(b)	a %= b
	
	*/

// Operadores Comparativos
	
	/*
	
		maior/menor	a > b		a.compareTo(b) > 0
				a < b		a.compareTo(b) < 0
		
		maior/menor	a >= b		a.compareTo(b) >= 0
		igual		a <= b		a.compareTo(b) <= 0
		
		igual		a == b		a.equals(b)
		
		diferente	a != b		!(a.equals(b))
		
		O método compareTo() retorna os valores:
		-1 (Menor que)
		0 (Igual)
		1 (Maior que)
		
		Os operadores retornam booleanos
		
		O método equals() retorna um booleano
	
	*/

	const val EQUAL = 0
	const val LESS = -1
	const val MORE = 1

	fun main() {
	    val d = 220
	    val t = 90
	    
	    println(d > t)
	    println(d.compareTo(t) == MORE)
	}

// Operadores Lógicos

	/*
	
		E  (&&)	(expressão1) and (expressão2)
		Ou (||)	(expressão1) or (expressão2)
	
	*/

// Operadores In e Range

	val numbers = listOf(3, 9, 0, 1, 2)
	println(12 in numbers)
	// false
	
	println(12 in 0..20) // range -> Int..Int
	// true

	// Retorna um booleano ao iterar uma lista verificando a presença de um valor

	// Exemplo 1. Bingo que pega número aleatório entre 1 e 34 e verifica sua presença na lista bingo
	
	fun main() {
	    val bingo = listOf(8,6,34,2,13)
	    var number = (1..34).random()
	    
	    println(number)
	    println(number in bingo)
	}

	// Exemplo 2. Gerador de idade aleatória que verifica se a pessoa pode doar sangue
	
	const val MIN_AGE = 16
	const val MAX_AGE = 68

	fun main() {
		var age = (10..100).random()
		println(age)
		println(age in MIN_AGE..MAX_AGE)
		println(age >= MIN_AGE && age <= MAX_AGE)
	}

// Manipulação de Strings

	fun main() {
		val s = "Olá, mundo!"
		
		println(s[0])
		println(s.first())
		// O
		
		println(s[s.length - 1])
		println(s.last())
		// !
		
		val name = "ana"
		val str = "Olá"

		println(str + name)
		// OláAna
		
		println("${str}, ${name}!")
		// Olá, Ana!
		
		println("Bem vinda(o), $name!")
		// Bem vinda(o), ana!
		
		println("Bem vinda(o), ${name.capitalize()}!")
		// Bem vinda(o), Ana!

		// Formatação
		
		capitalize()
		toUpperCase()
		toLowerCase()
		decapitalize()
		
		trimEnd()
		trimStart()
		trim()
		
		replace(x, y)
		
		"padrão ${valor}".format(valor)
		
	}


	// Diferença entre empty e blank

		// Se o tamanho da string for 0 está empty e blank

		val s = ""
		println(s.isEmpty())
		//true
		println(s.isBlank())
		//true
		println(s.isNullOrBlank || s.isNullOrEmpty())
		//true

		// Se o tamanho da string for maior que zero mas todos os caracteres são espaços em branco, 
		// está blank mas não empty

		val s = "     "
		println(s.isEmpty())
		//false
		println(s.isBlank())
		//true

// Introdução as funções

	// Prefixo fun

	fun nomeDaFuncao(parametro: Tipo):TipoRetorno {

	}

	// Funções anônimas, single-line, inline, extensões, lambdas, ordem superior

	private fun getFullname(name: String, lastName: String):String {
		val fullname = "$name $lastName"
		return fullname
	}

	private fun getFullname(name: String, lastName: String): String {
		return "$name $lastName"
	}

	// Funções de ordem superior

		// Recebem outra função ou lambda por parâmetro.
		// Bastante úteis para a genrealização de funções e tratamento de erros

		val x = calculate(12,4,::sum)
		val y = calculate(12,4){a,b -> a*b}

		fun main() {
			val x:Int
			val z:Int
			
			z = calculate(34, 90,::sum)
			x = calculate(5,5,{a,b -> a*b})
			println(z) // 124
			println(x) // 25
		}

		fun sum(a1:Int,a2:Int) = a1.plus(a2)

		fun calculate(n1:Int, n2:Int, operation:(Int, Int)->Int):Int{
			val result = operation(n1,n2)
			return result
		}

	// Funções single-line

		fun nomeDaFuncao(parametro:Tipo) = retorno;
		Função de uma única linha. Infere o tipo de TipoRetorno

		private fun getFullname(name: String, lastName: String) = "$name $lastName"

	// Funções/extensões

		// Prefixo fun Tipo.nomeDaFuncao()
		// Cria uma função que só pode ser chamada por uma tipo específico, cujo valor pode
		// ser referenciado dentro da função através da palavra 'this'

	fun String.randomCapitalizedChar() = this[(0..this.length-1).random()].uppercaseChar()

// Estruturas de Controle

	// if/else, when, elvis operator
	// Pode ser utilizado tanto para controle quanto para atribuição
	// Pode ser encadeado com múltiplas estruturas

	if(expression) {
		// code
	} else if(expression) {
		// code
	} else {
		// code
	}

	when {
		case1 -> {}
		case2 -> {}
		case3 -> {}
		else -> {}
	}

	val a:Int? = null
	var number:Int = a ?: 0 // Verifica se o valor é nulo ou não e oferece uma alternativa para o valor

	// Atribuição Condicional

		val maxValue = if (a > b) a else if (a < b) b else b

		val minValue = if (a > b) {
			println("b($b) é o menor valor")
			b
		} else if (a < b) {
			println("a($a) é o menor valor")
			a
		} else {
			println("Os valores são iguais")
			b
		}

	// When

		when {
			a > b -> {}
			a!= b && a > c -> {}
			b == 0 -> {}
			else -> {}
		}

		when (year) {
			-4000..745 -> //Antiguidade
			476..1452 -> //Medieval
			1453..1789 -> //Moderna
			currentYear -> //Ano Atual
		}

	// Elvis Operator

		// O mais próximo que a linguagem possuiu de um operador ternário
		// Verifica se um valor é nulo e apresenta uma opção caso seja
		// Pode ser Encadeado

		val a:Int? = null
		val b:Int? = 9
		var number:Int = a ?: b ?: 0

		// Nesse caso, se o valor de a não for nulo, number recebe a.
		// Se o valor de a for nulo e b não for nulo, number recebe b
		// Se a e b forem nulos recebe 0

	// Exemplo de uso - When, Elvis Operator e Extension Function

	fun main() {
		val grade:Int? = (0..10).random()
		val str:String? = grade?.getStudentStatus()
		println(grade?.getStudentStatus())
		println(str)
	}

	fun Int.getStudentStatus():String{
		println("Nota: $this")
		return when(this) {
			in 0..4 -> "Reprovado"
			in 5..7 -> "Mediano"
			in 8..9 -> "Bom"
			10 -> "Excelente"
			else -> "Indefinido"
		}
	}

// Estruturas de Repetição

	// while, do..while, for e forEach
	// Estruturas similares as convencionais em outras linguagens
	// Aceita os comandos in, range, until, downTo e step

	while(condition) {
		// code
	}

	do {
		// code
	} while(condition)

	for(i in 0..20 step 2) {
		println(i)
	}

	// for(index in/until/downTo faixaDeValores step invervalo)
	// in: conta do valor inicial até o valor final
	// until: conta do valor atual até o valor estabelecido menos 1
	// downTo: conta de maneira decrescente
	// step: determina o intervalo da contagem

	for(i in 0..20 step 2) {
		println(i)
	}

	for(i in 10 downTo 0) {
		println(i)
	}

	for(i in 0 until 10) {
		println(i)
	}

	var text = "Kotlin"

	for (letter in text) {
		println(letter)
	}

// Proposta de exercício final

	/*
		Com os conhecimentos aplicados anteriormente, vamos criar uma calculadora que
		dado dois valores Float? e um número correspondente a operação (constante), retorne
		imprima o resultado como Float ou uma mensagem de erro caso um dos valores seja nulo
	*/
