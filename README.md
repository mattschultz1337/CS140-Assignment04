<div class="post_region_content note" id="view_quesiton_note">
        
<h1 data-pats="title_text" class="post_region_title">assignment 04</h1>

<div class="post_region_text" id="questionText"><p>Due FRIDAY October 6, 11:59 pm (several students have important work due and also the names of the Serial and Parallel circuits were backwards and were only corrected on Tuesday)</p>
<p>&nbsp;</p>
<p>Use the following code for Question and ChoiceQuestion:</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">package</span><span class="pln"> assignment04</span><span class="pun">;</span><span class="pln">
</span><span class="kwd">import</span><span class="pln"> java</span><span class="pun">.</span><span class="pln">util</span><span class="pun">.</span><span class="typ">Scanner</span><span class="pun">;</span><span class="pln">
</span><span class="com">/**
 * A question with a text and an answer.
 */</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">class</span><span class="pln"> </span><span class="typ">Question</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	</span><span class="kwd">private</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> text</span><span class="pun">;</span><span class="pln">
	</span><span class="kwd">private</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> answer</span><span class="pun">;</span><span class="pln">
	</span><span class="com">/**
	 * Constructs the Question with the questions text and
	 * the correct answer if available
	 * @param qText the text of the question
	 * @param correctResponse the correct answer if available
	 */</span><span class="pln">
	</span><span class="kwd">public</span><span class="pln"> </span><span class="typ">Question</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> qText</span><span class="pun">,</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> correctResponse</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
		text </span><span class="pun">=</span><span class="pln"> qText</span><span class="pun">;</span><span class="pln">
		answer </span><span class="pun">=</span><span class="pln"> correctResponse</span><span class="pun">;</span><span class="pln">
	</span><span class="pun">}</span><span class="pln">
	
	package assignment04;
import java.util.Scanner;
/**
 * A question with a text and an answer.
 */
public class Question {
	private String text;
	private String answer;
	/**
	 * Constructs the Question with the questions text and
	 * the correct answer if available
	 * @param qText the text of the question
	 * @param correctResponse the correct answer if available
	 */
	public Question(String qText, String correctResponse) {
		text = qText;
		answer = correctResponse;
	}
	
	//setText is no longer needed

	/**
	 * Sets the answer for this question. It may need to changed from
	 * the one given in the constructor.
	 * @param correctResponse the answer
	 */
	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}
	/**
	 * Checks a given response for correctness.
	 * @param response the response to check
	 * @return true if the response was correct, false otherwise
	 */
	public boolean checkAnswer(String response) {
		return response.equals(answer);
	}
	/**
	 * Displays this question.
	 */
	public void display() {
		System.out.println(text);
	}
	/**
	 * Presents a question to the user and checks the response.
	 */
	public void presentQuestion() {
		display();
		System.out.print("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(checkAnswer(response));
	}

}
package assignment04;
import java.util.ArrayList;
/**
 * A question with multiple choices.
 */
public class ChoiceQuestion extends Question {
	private ArrayList<String> choices;
	/**
	 * Constructs a ChoiceQuestion with the text of the question
	 * but no correct answer.
	 * @param qText the text of the question
	 */
	public ChoiceQuestion(String qText) {
		super(qText, "");
		choices = new ArrayList<>();
	}
	/**
	 * Adds an answer choice to this question.
	 * @param choice the choice to add
	 * @param correct true if this is the correct choice, false otherwise
	 */
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			// Convert choices.size() to string
			String choiceString = "" + choices.size();
			setAnswer(choiceString);
		}
	}
	public void display() {
		// Display the question text
		super.display();
		// Display the answer choices
		for (int i = 0; i < choices.size(); i++) {
			System.out.println((i+1) + ": " + choices.get(i));     
		}
	}
}

</span><span class="pun">}</span><span class="pln">
</span><span class="kwd">package</span><span class="pln"> assignment04</span><span class="pun">;</span><span class="pln">
</span><span class="kwd">import</span><span class="pln"> java</span><span class="pun">.</span><span class="pln">util</span><span class="pun">.</span><span class="typ">ArrayList</span><span class="pun">;</span><span class="pln">
</span><span class="com">/**
 * A question with multiple choices.
 */</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">class</span><span class="pln"> </span><span class="typ">ChoiceQuestion</span><span class="pln"> </span><span class="kwd">extends</span><span class="pln"> </span><span class="typ">Question</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	</span><span class="kwd">private</span><span class="pln"> </span><span class="typ">ArrayList</span><span class="pun">&lt;</span><span class="typ">String</span><span class="pun">&gt;</span><span class="pln"> choices</span><span class="pun">;</span><span class="pln">
	</span><span class="com">/**
	 * Constructs a ChoiceQuestion with the text of the question
	 * but no correct answer.
	 * @param qText the text of the question
	 */</span><span class="pln">
	</span><span class="kwd">public</span><span class="pln"> </span><span class="typ">ChoiceQuestion</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> qText</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
		</span><span class="kwd">super</span><span class="pun">(</span><span class="pln">qText</span><span class="pun">,</span><span class="pln"> </span><span class="str">""</span><span class="pun">);</span><span class="pln">
		choices </span><span class="pun">=</span><span class="pln"> </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">ArrayList</span><span class="pun">&lt;&gt;();</span><span class="pln">
	</span><span class="pun">}</span><span class="pln">
	</span><span class="com">/**
	 * Adds an answer choice to this question.
	 * @param choice the choice to add
	 * @param correct true if this is the correct choice, false otherwise
	 */</span><span class="pln">
	</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> addChoice</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> choice</span><span class="pun">,</span><span class="pln"> </span><span class="kwd">boolean</span><span class="pln"> correct</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
		choices</span><span class="pun">.</span><span class="pln">add</span><span class="pun">(</span><span class="pln">choice</span><span class="pun">);</span><span class="pln">
		</span><span class="kwd">if</span><span class="pln"> </span><span class="pun">(</span><span class="pln">correct</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
			</span><span class="com">// Convert choices.size() to string</span><span class="pln">
			</span><span class="typ">String</span><span class="pln"> choiceString </span><span class="pun">=</span><span class="pln"> </span><span class="str">""</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> choices</span><span class="pun">.</span><span class="pln">size</span><span class="pun">();</span><span class="pln">
			setAnswer</span><span class="pun">(</span><span class="pln">choiceString</span><span class="pun">);</span><span class="pln">
		</span><span class="pun">}</span><span class="pln">
	</span><span class="pun">}</span><span class="pln">
	</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> display</span><span class="pun">()</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
		</span><span class="com">// Display the question text</span><span class="pln">
		</span><span class="kwd">super</span><span class="pun">.</span><span class="pln">display</span><span class="pun">();</span><span class="pln">
		</span><span class="com">// Display the answer choices</span><span class="pln">
		</span><span class="kwd">for</span><span class="pln"> </span><span class="pun">(</span><span class="kwd">int</span><span class="pln"> i </span><span class="pun">=</span><span class="pln"> </span><span class="lit">0</span><span class="pun">;</span><span class="pln"> i </span><span class="pun">&lt;</span><span class="pln"> choices</span><span class="pun">.</span><span class="pln">size</span><span class="pun">();</span><span class="pln"> i</span><span class="pun">++)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
			</span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">((</span><span class="pln">i</span><span class="pun">+</span><span class="lit">1</span><span class="pun">)</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> </span><span class="str">": "</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> choices</span><span class="pun">.</span><span class="kwd">get</span><span class="pun">(</span><span class="pln">i</span><span class="pun">));</span><span class="pln">     
		</span><span class="pun">}</span><span class="pln">
	</span><span class="pun">}</span><span class="pln">
</span><span class="pun">}</span></pre>
<p>Make a class <code><tt>FlexibleChoiceQuestion</tt></code> as a subclass of <code><tt>ChoiceQuestion</tt></code>. This one will allow the programmer to set the correct answer, instead of a single number. You will need to write a constructor one parameter, which is send up to the constructor of <code>ChoiceQuestion</code> using <code>super(qText);</code> that is the only line in this constructor. Note that constructors are <span style="text-decoration:underline">not</span> inherited.</p>
<p>&nbsp;</p>
<p>In <code><tt>FlexibleChoiceQuestion</tt></code>:</p>
<p>Override <code><tt>addChoice(String choice, boolean correct)</tt></code> to throw <code>UnsupportedOperationException</code> (this is already in the JavaAPI in java.lang), with the message "<em>Use the one-argument version</em>". Create a method <code><tt>public void addChoice(String choice)</tt></code>, which simply calls<code> <tt>super.addChoice(choice, false)</tt></code>.</p>
<p>Provide a field (Set and HashSet are imported from java.util) <code><tt>Set&lt;String&gt; answers = new HashSet&lt;String&gt;()</tt></code>.</p>
<p>Provide a method <code><tt>public void addAnswer(int i)</tt></code>, which calls<code> <tt>answers.add("" + i)</tt></code> but first checks if <tt>i &lt;= 0</tt> and throws <code><tt>IllegalArgumentException</tt></code> if it is with the message "<em>Answers must be numbered from 1</em>".</p>
<p>Override <code>presentQuestion</code> so that instead of having<code> <tt>System.out.print("Your answer: ")</tt></code>; it has</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="kwd">print</span><span class="pun">(</span><span class="str">"Your answer (separate multiple answers by a space: "</span><span class="pun">);</span></pre>
<p>Override <code>checkAnswer(String response)</code> as follows:</p>
<p>&nbsp;</p>
<p>First make the array <code><tt>String[] parts = response.trim().split("\\s+");</tt></code></p>
<p>then make a set <code><tt>Set&lt;String&gt; responses = new HashSet&lt;String&gt;()</tt></code> and add all the elements in<code> <tt>parts</tt></code> to<code> <tt>responses</tt></code>.</p>
<p>If <code><tt>responses.size()</tt></code> is not equal to<code> <tt>parts.length</tt></code>, print a line saying "<em>You have repeated answers</em>"</p>
<p>In any case, if <code><tt>responses.equals(answers)</tt></code> return <tt>true</tt>.</p>
<p>Save the current size of <code>responses</code> temporarily and call <code><tt>responses.removeAll(answers)</tt></code>. If the size of<code> <tt>responses</tt></code> is now 0, print a line saying "<em>Your answers were correct but you missed some</em>" and return <tt>false</tt>.</p>
<p>If the new size of <code>responses</code> is less than the temporary value you saved, print a line saying "<em>You have some correct answers and some incorrect ones</em>" and return <tt>false</tt>. After that&nbsp;print a line saying "<em>All your answers were wrong</em>" and return <tt>false</tt>.</p>
<p>&nbsp;</p>
<p>Write a main method in a <code>Demo</code> class that tests the full functionality of your code.</p>
<p>&nbsp;</p>
<p>Get your class <code>Person</code> from Assignment 1. Make a class<code> <tt>Employee</tt></code>, with private fields<code> <tt>Person</tt>&nbsp;person</code> and <code>double <tt>salary</tt></code>. Make a class<code> <tt>Manager</tt></code> that is a subclass of <code><tt>Employee</tt></code> and give <code>Manager</code> the private String field<code> <tt>department</tt> </code>and an<tt> </tt><code><tt>ArrayList&lt;Employee&gt; team</tt></code><tt>, initialized to an empty ArrayList</tt>. The constructor of <code><tt>Employee</tt></code> should have the<code> <tt>Person</tt> as a parameter</code> but the<code> <tt>salary</tt></code> and<code> <tt>department</tt></code> should just have <em>setters</em> and there needs to be an <code><tt>addToTeam(Employee)</tt></code> in<code> <tt>Manager</tt></code> to be able to populate the<tt> </tt><code><tt>team</tt></code>. <strong>Addition: The constructor of <code><em>Manager</em></code>&nbsp;should take in a <code>Person p</code> as a parameter and call <code>super(p)</code>.&nbsp;</strong>Provide a <code><tt>toString</tt></code> in<code> <tt>Employee</tt></code> that returns the<code> <tt>Employee</tt>'s</code> name and<code> <tt>salary</tt></code>. Provide a <code>toString</code> in<code> Manager</code> that does the same thing but also adds the <code>department</code> on a separate line and then adds all the team members on separate lines, each one indented using one tab ("\t").&nbsp;<strong>Additional&nbsp;</strong><strong>Hint: </strong>To access the manager's name and salary that you passed into the constructor using Person p, you can call <code>super.toString()</code> to get the Manager's employee information, assuming you have written your Employee toString() method correctly.</p>
<p><strong><span style="text-decoration:underline">You MUST use a StringBuilder as described on Slide 6-10 to do this.</span></strong></p>
<p>&nbsp;</p>
<p>Write a test program that has 2 Managers, one with a team of 2 people and one with a team of 3 people.</p>
<p>&nbsp;</p>
<p>The third question will be a version of P9.6 on page 462. There is not much to do here, except to see that to overcome the restriction that a constructor must call super(...) as the first line, we can only do computations and throw exceptions by calling methods--which have to be static!</p>
<p>&nbsp;</p>
<p>The class <tt>ResonantCircuit</tt> has 3 private double fields <tt>frequency, bandwidth, gain</tt>, which have the symbols ω<sub>0</sub>, <em>B</em> and <em>k</em>, respectively, in the textbook.</p>
<p>&nbsp;</p>
<p>Write a constructor with 3 parameters that set the values of the fields. Write a <tt>public void display()</tt> method so that if a tester has</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">ResonantCircuit</span><span class="pln"> r1 </span><span class="pun">=</span><span class="pln"> </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">ResonantCircuit</span><span class="pun">(</span><span class="lit">10</span><span class="pun">,</span><span class="pln"> </span><span class="lit">3</span><span class="pun">,</span><span class="pln"> </span><span class="lit">70</span><span class="pun">);</span><span class="pln">
r1</span><span class="pun">.</span><span class="pln">display</span><span class="pun">();</span></pre>
<p>prints</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">Resonant</span><span class="pln"> </span><span class="typ">Circuit</span><span class="pln"> </span><span class="typ">Characteristics</span><span class="pun">:</span><span class="pln"> 
	frequency</span><span class="pun">:</span><span class="pln"> </span><span class="lit">10.0</span><span class="pln">
	bandwidth</span><span class="pun">:</span><span class="pln"> </span><span class="lit">3.0</span><span class="pln">
	gain</span><span class="pun">:</span><span class="pln"> </span><span class="lit">70.0</span></pre>
<p>&nbsp;</p>
<p>Note that the character <tt>'\t'</tt> gives a tab indent.</p>
<p>&nbsp;</p>
<p>Make a subclass <tt>ParallelResonantCircuit</tt> that extends <tt>ResonantCircuit</tt>. The private double fields are <tt>resistance</tt>, <tt>capacitance</tt>, <tt>inductance</tt>, which have the symbols <em>R</em>, <em>C</em>, and <em>L</em> in the textbook.</p>
<p>&nbsp;</p>
<p>Make the method <tt>static private double computeBandwidth(double r, double c)</tt>, which throws <tt>IllegalArgumentException</tt> with the message "<em>inputs cannot be zero</em>" if r or c is zero, it returns 1/(r * c). PLEASE NOTE THAT 1/r * c would be wrong because 1/r* c = (1/r) * c = c/r. On the other hand the value we want is 1/(r * c) and it could also be written 1/r/c.</p>
<p>&nbsp;</p>
<p>Explanation: The textbook shows that C = 1/(B*R) so we have modified that to get B = 1/(R *&nbsp; C).</p>
<p>&nbsp;</p>
<p>Make the method <tt>static private double computeFrequency(double c, double L)</tt>, which throws <tt>IllegalArgumentException</tt> with the message "<em>inputs cannot be zero</em>" if c or L is zero--note a lower case "ell" looks too much like 1--it returns <tt>Math.sqrt(1</tt>/<tt>(c * L)).</tt></p>
<p>&nbsp;</p>
<p>Explanation: The textbook shows that L = 1/(ω<sub>0</sub><sup>2</sup>*C) so we have modified that to get&nbsp;ω<sub>0</sub> = √(1/(C * L)).</p>
<p>&nbsp;</p>
<p>The constructor has parameters to set the values of resistance, capacitance and inductance but it starts with the line</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">super</span><span class="pun">(</span><span class="pln">computeFrequency</span><span class="pun">(</span><span class="pln">c</span><span class="pun">,</span><span class="pln">l</span><span class="pun">),</span><span class="pln"> computeBandwidth</span><span class="pun">(</span><span class="pln">r</span><span class="pun">,</span><span class="pln">c</span><span class="pun">),</span><span class="pln"> r</span><span class="pun">);</span></pre>
<p>&nbsp;</p>
<p>Explanation: The textbook shows R = k (resistance = gain).</p>
<p>&nbsp;</p>
<p>Override display (the first line is super.display()), so that so that if a tester has</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">ResonantCircuit</span><span class="pln"> r1 </span><span class="pun">=</span><span class="pln"> </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">ParallelResonantCircuit</span><span class="pun">(</span><span class="lit">70</span><span class="pun">,</span><span class="pln"> </span><span class="lit">0.05</span><span class="pun">,</span><span class="pln"> </span><span class="lit">0.07</span><span class="pun">);</span><span class="pln">
r1</span><span class="pun">.</span><span class="pln">display</span><span class="pun">();</span></pre>
<p>prints</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">Resonant</span><span class="pln"> </span><span class="typ">Circuit</span><span class="pln"> </span><span class="typ">Characteristics</span><span class="pun">:</span><span class="pln"> 
	frequency</span><span class="pun">:</span><span class="pln"> </span><span class="lit">16.90308509457033</span><span class="pln">
	bandwidth</span><span class="pun">:</span><span class="pln"> </span><span class="lit">0.2857142857142857</span><span class="pln">
	gain</span><span class="pun">:</span><span class="pln"> </span><span class="lit">70.0</span><span class="pln">
	resistance</span><span class="pun">:</span><span class="pln"> </span><span class="lit">70.0</span><span class="pln">
	capacitance</span><span class="pun">:</span><span class="pln"> </span><span class="lit">0.05</span><span class="pln">
	inductance</span><span class="pun">:</span><span class="pln"> </span><span class="lit">0.07</span></pre>
<p>&nbsp;</p>
<p>Next make a similar class <tt>SeriesResonantCircuit</tt> that extends <tt>ResonantCircuit</tt>.&nbsp; The three fields are the same as SeriesResonantCircuit but the computeFrequency and computeBandwidth methods are different. Modify those methods based on the new equations:</p>
<p>&nbsp;</p>
<p>R = 1 / k, L = R / B, C = 1 / (ω<sub>0</sub><sup>2 </sup>* L)</p>
<p>&nbsp;</p>
<p>The rest of the code for <tt>SeriesResonantCircuit</tt> is the same as <tt>ParallelResonantCircuit</tt></p>
<p>&nbsp;</p>
<p>Add tests in the test class.</p><br></div>
<div data-pats="folders" class="post_region_folders">
  <span>
    <span data-pats="folders_item"><a data-pats="link" href="#" class="tag folder" onclick="PEM.fire('filterFeed', {filter:'folder',folder:'assignment4'});return false;">assignment4</a></span>
  </span>
</div>
<div class="attachments" style="display:none;">
  <div class="attachments_divider"></div>
  <div class="attachments_count">Attachments:</div>
  <table class="attachments_list">
    
  </table>
</div>
<div class="post_region_message_wrapper">
  <div id="endorse_text"></div>
  
  
  

