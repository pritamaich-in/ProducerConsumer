# Producer Consumer Problem
## Problem Statement
In a company there are a producer machine and a consumer machine. Producer machine produces a product and consumer machine consumes a product. But there is a problem with storage. It can only store one product.

So, if there is no product, consumer machine has to wait. If there is a single product available in storage, producer maching has to wait until the existing product is consumed.

After performing jobs both machines take rest for [0-5] seconds.
## Solution
The problem is solved using multitherading - syncronizing produce and consume methods and interthread communication.