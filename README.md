To design a distributed task scheduler

Functional requirements

The functional requirements of the distributed task scheduler are as follows:

Submit tasks: The system should allow the users to submit their tasks for execution.
Allocate resources: The system should be able to allocate the required resources to each task.
Remove tasks: The system should allow the users to cancel the submitted tasks.
Monitor task execution: The task execution should be adequately monitored and rescheduled if the task fails to execute.
Efficient resource utilization: The resources (CPU and memory) must be used efficiently in terms of time, cost, and fairness. Efficiency means that we do not waste resources. For example, if we allocate a heavy resource to a light task that can easily be executed on a cheap resource, it means that we have not efficiently utilized our resources. Fairness is all tenants’ ability to get the resources with equally likely probability in a certain cost class.
Release resources: After successfully executing a task, the system should take back the resources assigned to the task.
Show task status: The system should show the users the current status of the task.
Non-functional requirements#

The non-functional requirements of the distributed task scheduler are as follows:

Availability: The system should be highly available to schedule and execute tasks.
Durability: The tasks received by the system should be durable and should not be lost.
Scalability: The system should be able to schedule and execute an ever-increasing number of tasks per day.
Fault-tolerance: The system must be fault-tolerant by providing services uninterrupted despite faults in one or more of its components.
Bounded waiting time: This is how long a task needs to wait before starting execution. We must not execute tasks much later than expected. Users shouldn’t be kept waiting for an infinite time. If the waiting time for users crosses a certain threshold, they should be notified
