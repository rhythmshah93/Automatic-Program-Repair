ANALYZING THE RELATIONSHIP BETWEEN THE SIZE OF THE TEST SUITE AND THE FAILED TEST CASES IN THE CONTEXT OF FAULT LOCALIZATION
========================================================================

RHYTHM SHAH
-----------

rrshah3@ncsu.edu
----------------

INTRODUCTION
------------

 
With the time competition and market pressure, the time between releases of a software is being minimized as much as possible. Google Chrome releases an update every six weeks while Ubuntu releases an update every 6 months. To help reduce the time to release, Continuous Integration [1] is increasingly becoming the norm in the software development life cycle. Techniques like fault localization can be used in such situations to help find the faults faster and further reduce the time between commits. Research has been done on how these techniques could be used to find as many faults as possible while limiting the time. These papers focus on the selection of test cases and how to prioritize these test cases for maximum efficiency [2] [3]. Selection and prioritization of test cases is an integral part of fault localization as the selected cases will affect what parts of the code are covered and what are not. However, it is constrained by the resources available and the time it takes to report the results. For example, Google is experimenting on how to integrate this to identify faults in its pre commit phase and aims to execute as few a test cases as possible while providing a certain level of effectiveness by selecting a higher number of failed test cases. The selection of test cases also affects patch generation tools like  GenProg which use fault localization to identify which lines should be affected by the tool [4]. However, none of these papers talk about how the size of the test suite affects the fault localization as compared to the number of failed test cases included in the test suite.This project, thus, aims to analyze the effect of the size of the test suite versus the effect of the failed test cases on the effectiveness of fault localization. This could affect how test cases are selected and could provide an idea about what the size of a test suite should be for maximum effectiveness, corresponding to the resources available. Additionally, the project aims to explore if the results are consistent for different test case selection techniques.

•	**Research Question 1:** For fault localization, how does the size of the test suite compare to the number of failed test cases included?

•	**Research Question 2:** How does the selection of test cases affect the previous results?

EVALUATION PLAN
---------------

The fault localization tool Tarantula will be used on a set of Siemens and UNIX suite of programs, which include both single and multi-fault programs. This is the same set as used by the study detailed in ‘How well does test case prioritization integrate with statistical fault localization?’
The metrics used to evaluate the results of fault localization would be the percentage of faults found to the total number of faults and the amount of time taken to execute the test suite.

For RQ1, we change the proportion of failed test cases included it the test suite to the size, and we keep doing this for increasing size. This will allows us to compare the effect of failed test case for each size, and the effect of size for a particular proportion of failed test cases; this will be done for a specific test case selection technique (one out of ART, Random and RTS).
For RQ2, the same procedure as RQ1 will be examined while on the rest of the selection techniques.

TIMELINE:
---------

17th October: Finalize the test case selection technique for RQ1.

31st October: Perform the analysis for RQ1.

6th November: Record and analyze the results of RQ1.

20th November: Perform the same analysis as for RQ1 for the remaining selection
techniques.

25th November: Analyze the results and contrast with the results from RQ1.

References:
-----------

[1] P.M. Duvall, S. Matyas, A. Glover, Continuous Integration: Improving Software Quality and Reducing Risk, Addison-Wesley, Upper Saddle River, NJ (2007) 

[2] Jiang, B., Zhang, Z., Chan, W. K., Tse, T. H., Chen, & Yueh, T. (2012). How well does test case prioritization integrate with statistical fault localization? Information and Software Technology, 54(7), 739–758. doi:10.1016/j.infsof.2012.01.006

[3] Elbaum, S., Rothermel, G., & Penix, J. (2014). Techniques for improving regression testing in continuous integration development environments. . doi:10.1145/2635868.2635910

[4] Goues, L., Claire, Dewey-Vogt, M., Forrest, S., & Weimer, W. (2012, February 6). A systematic study of automated program repair: Fixing 55 out of 105 bugs for $8 each. Retrieved October 11, 2016, from 
http://dl.acm.org/citation.cfm?id=2337225
