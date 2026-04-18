<!-- # 📘 Day 01 - Arrays Notes

## 📌 Definition

An **array** is an indexed collection of a fixed number of **homogeneous (same type)** elements. 

👉 Key idea:

* One name → multiple values
* Stored in **continuous memory**

---

## 🧠 Why Arrays?

* Improves **readability**
* Easy **access using index**
* Efficient for storing large data

---

## ⚠️ Limitation

* Fixed size ❌
* Cannot grow/shrink dynamically 

---

## 🧩 Types of Arrays

### 1️⃣ One-Dimensional Array (1D)

![Image](https://images.openai.com/static-rsc-4/N5TOyhg9PQvqxMmMo-Oar-Q5uSQ32B06PwagiTrll6czBQJtxqvxSGgrLmZ22bohUdcodIUbxeNXeptBrRUoBvBrCGT8aGYOzcQ4hakwI5kksMPxw7K32LP87HZg-DdUQ8Jx-r1fzPtIXN2C2iN9T8-HiUDzivhz-vQbYFNyALZeWHl9BjUm60uBNal2ApZq?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/I7yPwQgl0i5CzPbx4EBPWe6NXuJs831k3evCn4EGcwRj3DZltkbvATqJQVFXKryGlfaW6AXBAPBI5qQthQ7R-LzSJ_XhGeoxRhOE71-HGogd2OnFwPd6gg7313N5tm_nib_aocjWw9VKTA72OoAnQi0OaI9bS1gX_yZdm3wyBHicL0Pe282VtTH03jKoYaYv?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/gyeDDVvIWHTLlo7G4DHApalUQN81sAbpgw7p5wyWcjLY7Vefj4fh_Z8qHi0Ka6DBPjMH7Tj1z4a2a4JcBlvp8RIoRAMzcSEFkMge8Z1aEdYXhxq5TBW6pdzLzsm3N1Zt9DfqDDeMBeUBuqSqd0NQq7si-4FfnEafNf-7sElKEmU4Kt2Km_Aw5vw-FZ3qxfTA?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/1a3UjF4myl3EbwHTlSTDbk2aNnBrv5diCxKjgYZGr7gZx2jqEnGIAjHG2vjZxIPiKLWIVfu1v8xOd-kmcVJ1u43xVDDrBOSmLR8YoTUqDbvecFPFeUvgSJ5_Nr8R4f4LGgb7TWpAfatL4pp_GarzerztIQbF_rUpEJB0ECbyqqF4RLrtvGz352Ts0LKdEUNC?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/3zTDkj_5mAHBVt0Iuo-wQs_d9rOCDeZ3So-i8Qflvu7nKGkcLohnzzQKl9g9cm5ogncNqY9w_X4aF_2UE4EE0kPCw-rdOwnvTc9kNuLWKYlEdCYyLFh7y7EOtuzFw2zltC57K4upkRlFolWXHaRjgjuipC2xIAtLWwD5yqP7mWXrTsImA00tFvRHa8qWAgXg?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/WSPqq79vrKMClQXYq4N4LUOAsvZFFyCdB7x6Q623Petpw1ixeusmjbgxIY-iNV1yN3VyvFrXuyszhV8njQsWssTI3xQsov99grWgGwM1UqzzioX6HKNheerBgv-9tW8S3kaPBfdIh2O_eyXvEmkZGDABf_Dver5nnN3qI9kFZaaDxlYZVeJ9StMzMdRmwVUV?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/kCzki-LjFbWA8oM62wm7f-qkaAJF9sbLwoJUEQK0LF4d60bKCk2shrqzIyLQGsiqC9gD7jKsqJN9wMsvDb4CJ-Org6u7ncHhfYKatoKAINL1bVjfiCTYnzknKDAa_fSIN7506PcRfR-KWFBJFEZoWGaTj0fEYmfs5sjBrwBF99ZLeEJSajuuL3jG6sRwakaF?purpose=fullsize)

```java
int[] arr = new int[5];
```

* Single index
* Linear structure

---

### 2️⃣ Two-Dimensional Array (2D)

![Image](https://images.openai.com/static-rsc-4/SJls9474I1q49sON6mzrGp_fXmYrokns3tswR1xFlF9spR3UZGsTbDkSOGBdRfY9REB3xGo2FGDrlOudLTYlCqoFUTtzMu_EhmBgbsXTr3hxGheiTKESedu9rv3n2hQjaGeHDwKEh7lF2sQ82kkZplnHs7MHiQNISvBBFo0FfIZUcXiScxBXjSaJ3vJBl0Qc?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/CzLKfq0lYAskVkWr3lweGhFOyvva3pCcKlC1zSVMZm9NvUsIj9CfR7B3sKOBT_sEn3TZKEHQLZCyMx_B0bxvI82_01V9Vbb-hgdFFB6uZXjd0JzRjafQRg4rrDGuAN-YyvB6OxbR202R8auMdb9Z4x9PJKuulQERVzhneTAyh1zMWFtUSyEHlSRx_Jlq54Xz?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/_t__y7okNCCijjcG0rxDek9kWIoGz3mC6Cwist1-kZWdYDc2zanACS91xwCnbi5Yg9TSEbczgCTcIfZiYfw6wbgSc89N7I9J-zkOt6vSqLi_Qt74mfeSVxgwI0tuAZihjo6xQNkN-XKL8IS8FR2T2oe_DW5MeyXfnG_DokW4uvPx7KVFifXG9UTXQbzmhVoj?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/aORYkuAqojrE2BRlUCeLphojIgqi3kyGPgFlDoEiduqeFxMXcaeAurBtnCnMvHS-SyftK2qzS5nkNL-MhHs9_2qPxCDYa3ln3bW2uZnTSiUjc5Pc9t0vJziAsbrx1xfmBrmEz7-jnfBao02L5WdY5ltHKr_X51HSfpliqqLoE7xG51KBapheiNPfYPkLy-UP?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/eKmOx5NjM-ldKCS0GpBFyv1ZXkut_M-_aH6vjkoPHID5glGtMmCRV5RcWb8NOr1vA7uHWc1FlGpidOG-p72tovKnDDhPWh-8disWq_4brUcCo8r8fe95zfpEmNm_BiOCR3BlUfkyIpVcNtH2XxzpXSlRZCFX5Q1EgBLtMwyNhNuCk7Jz2Q9953miP9tyE8Hr?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/I11R53IKlMq64HfLewNShU1b8I6tAblRlzYau-WECuotJ0Buu_1_x8Bu-78BAebmdQZlbscAH11vwV2NgnilJB7-VFUgN20YKX8cWQD5dgWMG271WhfDWOssiQWIPvF42IlB6rVuulUicNBRuv1MExMyt6tsfv5LoBc8hPVhPyNDAsbO7T99BzPm9H8xEZfA?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/3Gqklx4TnaBQJd4ZXDM6NnrOWBr8fHDtVG6xUR8NSAo4Agu3XHl9sJl2X_OpMBjskwjaidbYwpNvUbyjmjeQku-g-X5S_8Sl4954Yl2NvP2OjhsmEgaIXgLDqpGoJBT6kAlT93eIYt3uo7qeWmoCSyT7sSgq_0s88UFCk955rkcdCNOFq1ZKqFCsWpQeyK4V?purpose=fullsize)

```java
int[][] arr = new int[2][3];
```

* Rows and columns
* Table/matrix-like

---

### 3️⃣ Multi-Dimensional Array

```java
int[][][] arr = new int[2][3][4];
```

* More than 2 dimensions

---

### 4️⃣ Jagged Array (Important)

![Image](https://images.openai.com/static-rsc-4/eOv6PbjqckVZ2rOsTf5OQ3J9OxO-vs6y5QC9n0PSMWXsWx4sCMxbQGEb1ePX6nEW4Z1X3poXUOGN0LdCdozeKJfEx8GZ0nT31mdiMR-XVoVQR7VAzYYbGqUXdqmZep_B1GM1QGQEYu4rWt7pGQTkBwQDSf7lh07kQcgvQalLV5xZw8zHdaEuJXrI5fWUxfkA?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/DkFXY6dBwwfUFK9cRsHbHW3oI4Ywoi5JkORigtkTzp9Tqoefu-f2QTZ2LL3EPC4JtFjGdrMSuD9VrPc-_2Lt6hOj0SlVArfNehbDbpXQFzNHW75NqbfWCW5OWiEdFg0S1bWP3Z-aO93KDXqxcougvH0zNEkmlfE_QK3Tg2NIu6C96hXnlwEfV3OB23Xceukx?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/Bbk7_LKRK-GrlmFP4PrihdCxKK3D8iOHf8M3CbN9SWHxLn6xmeJ-J69YykPilnTmc8fEOg0pv5axR9u3L8d_QgWqhMbnPyfZUH7Iy_kPcCSO2A8q3s1pupCWPkdl2_VQSq1f0nnsYpHU1D9joKkEX8vgPmxl8iQ5ldAJ133ueRmeLOWeZRKpeThDKXhobWp9?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/dh2S-fu4CZo5WNjKycEaQjr26mRDU-lmU7T2V-24Qfv5wQTICNNztEbzlXokmHKStZQ-_Q8vtstWuc1APNRPcBOdiiJwMp4zEeRtx6o5SmsOdZ-vEfa3TnCy7_VwqpXMUnLJ8taUFYe2gycNM3ElhnPdHQ6op4qGLP1_co97lFIL1ZuP3XqgFWGbfEDZT0kO?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/p043ZsyeiFRniKaJy7pfNmne-BNN2r-ABUulzF1blA77I5sCRDNh_CcWDrOmGEpEP-JyOGeiWbvEU2oH8ZCFfxS_aR4bFnjv6T-PGU7wsYlTmxpuvQXxtHzP9ikDzo_4gZZzH8x2UOJr0yJM82vV9T0yBfHvERiao-Ii8JOx54C2WwTMiPQcxoxmteDF9nlK?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/00CtTpNqgaJJ1P35zysfZotyqm3_0F-IB9_IGxFjZpGPAQznTdhmqOSj4tuCqmJMl6pJarteEhxt8GXiMgKsjH33jihkJB_1Arcw6skgQCeiBSzZSvZ-ribgzf0vIO5KAUeNlCM4hGzakGY_wqK0O6c6k0jVEVZJBMSE6y01eh52BChlbZlzqZtIMIxNe5DJ?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/700W6-_iafTWRox4cKga_c6oTESsi5WnklBxZk5leZpNO0ohkd31CzRnC274xfVAWiN66wM3A4aBsrJ3pJgUfWmWUB0xpVeaM8fYgTEcTDgOur7sXb693pnb8A-skysZB_yPL5zk-hV8gYPiKzbd9RqOAD-eEzL41hqwY6sp7kfCxcYVHp9ESn1ruRhOffdy?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/Z12d6GUpUB4WUfjOVvb8Q9zxzWZLrmHWxcJhEJCLgy6p4CBWBpVBZWCYsAn-KlhnVLgcGVXE3zMFOIGk6SJvTtptrXZgO_DCCtCHo6V1whVINWuImFEW6DEWbvuhz6pIFkIGziaG32my-UB8xBVtOUxxD9KcFkCzeX4fsgZYjLCYX7-tXcxhZ4Wti3zX3oVJ?purpose=fullsize)

```java
int[][] arr = new int[2][];
arr[0] = new int[3];
arr[1] = new int[2];
```

👉 Java uses **array of arrays**, not strict matrix 

---

## 🏗️ Array Declaration

```java
int[] a;      // recommended
int a[];
```

❌ Invalid:

```java
int[5] a; // size not allowed during declaration
```

---

## ⚙️ Array Creation

```java
int[] a = new int[3];
```

👉 Important rules:

* Size must be given
* Size ≥ 0
* Negative size → Runtime Error

---

## 🧪 Default Values

When array is created:

| Type         | Default Value |
| ------------ | ------------- |
| int          | 0             |
| float/double | 0.0           |
| boolean      | false         |
| object       | null          |

![Image](https://images.openai.com/static-rsc-4/OZdiTrVzmwJ6MukjLP6kVTnKlPGW9j4b77SvbRGPeSGqJW_SwP686sZ_RCaa_Qf6BI2cQBcaM0zcMfM3hQXSOSbqQYJvdY-j8S2dHMLH7-SBnZWSxRR6UuPcFe3Px-70oAGi4rwcdAg7R94o2mWV0x1xkG-x0u4Rc5QcxzgQ037wCTd0oE-nB8ci4q5W3R8q?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/uqjGhmy57rEnFTuEJUvdpbkRVomQwj6qgEzkAQe_5LzXxkAnXAQ_3NnFNLZFteNA_7lhghrsFLvwBysEonc2MQ2drzTw-16ZH6s7P6qkxjj27NNWbAlO4_hhnqPn-EyRggmFTR4aozTGqcWFcqTIzj62D5_rnswIJKok3VQ0tWPjQ3j2zlvyDrDhs-CR2h8R?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/hKSvruMuk29rOkWRVgyViD38CFv8ZHIRfow795nRkffz9gEzsyXu6tBTLkTZyeafxr2UxNWGD2bO1DG4RtEEO5Yh5yBjNYSLpfDCFgMld3zjJBnBGZ_oDU_y0CMIraJc5tCd02qLrw8VmyO8p9m3TGYAJQ69mTm7F6RDQ5N3Y33pwGz2dwMc7fk5L3JZd78-?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/C5amOYkWnELwN_7otVMoI7h3p7DRFns76U0hFmfSyNSCXpQzYA7w0CB0i3MvFTSlsSLSjGp5hsHANDZqlUY7-sZfhhM7VlqE7oRssXSTaZxDTmNSPbJQbUJzI3ReoEzzlNk7FEMBICyAscxPP00It0zWEraIsSu0fY8IZ0BETzDAa3cTVrY8hwm0vAF4gD37?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/CnXIFQnL874M7Z6VGILd_57N_-m1j4cR6s0daHa6Jqi_ntoSs_KGtwZ6fiBhcfn3UqEMyk2TOMsLOSCNaKfzxtc0B4Pu20mvtzxz_lNpFDhFgRGGKkF2NzZC77FaIxvvyYc9dCjYS0ek2ivQqfsUob_ahHVJQn5Ro-aBdjdrzkVraeog3MzQ2_lzfPJQZpdN?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/74Pe0TvO-3F5G-qxG6DH3rCYQkz0wD0g7Zd1zQYqjljTp9dSj2Qm7HPg8nRRi8lSJb_3x6ASrhELoDPmj195fu19g69UIljwZ85zhOHts-H0Px9xIeTIiPKxR3WepvSCBqcnyJm43XV_matN4DbNce0S3cqNG6QQfvL9tvrk14PPpBPVHbkbeVqAjSX1_oT7?purpose=fullsize)

---

## 🧱 Memory Representation

![Image](https://images.openai.com/static-rsc-4/I7yPwQgl0i5CzPbx4EBPWe6NXuJs831k3evCn4EGcwRj3DZltkbvATqJQVFXKryGlfaW6AXBAPBI5qQthQ7R-LzSJ_XhGeoxRhOE71-HGogd2OnFwPd6gg7313N5tm_nib_aocjWw9VKTA72OoAnQi0OaI9bS1gX_yZdm3wyBHicL0Pe282VtTH03jKoYaYv?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/FQ1hWWGgZsSlPKVZNdz8gqbAdNpZLvPnt2YtTI0NR7BnU9LD_dVRh60khnNZsPW75Fujubop47mW54Ib_Ji7kj41i7a8lxAiDXQa79qe3yB0eg64w2RvsoDlWfP1ityx1lGLDTZsH5cuR40_PnumltK_4sMUvVReC8kM49VX55Zd1azwqe8uVsW_ZN1pVFBV?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/QqC2ZqY1DwB6DncIeicbPjk-VSYcO-SztuB_XCMD9OlQyaEnJEiZzXAVZiIiq5gOa4N_jcacI9r9CKRvz6wY6HX8oXN65v9an5uhu3j2wq4th0sWn187CnM7oCdWCOgPjy9li-5Qmj-Pcp1_e4WenJPcFLt-HsSnf9BNYQuq8Lho34nHNwRZGtn8hzAA6bTn?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/GMGV727XFVxGXIEWml-8dSpkGeSKL6-vS5hP7v4SztGD18iD3AU0IyCW4yGzSCWMBPI48jeRyKGWWsPEWi9Gne6zq6cnZFEI37eGEnIH00gkLU-pg7n2VF4PIrOjM1Bu35xWnXufCuICUsfXXOXqAzKW768jEYQrVQyoWpmc30vG7HN9GWJhsj5sRGG-b3US?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/jIEyRsxVtQiajL0glGaoYCEYtrFgeJZHx15uf9okixmSXZhqQTtRhpetSXOd_rZ-dZ-IvXKLoA4M9r8gnya4GCPQvRB8Sa62rKMNhIxeyXEo8H71RnU418n_9nsAb6l8wc593udYMRhXJqymb4ANuNlfKCGDvIPNOmGwkI_VY_S-MqXFlSkKm0OiXiUTdK5H?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/XD_mRX15wdTQCROXFw3qvKUom-H3NSHqBA2XM3ClP8oi2LiFY1xTd0a2iB6pbV4R1i6yeOplfk8R12pTjdbqFCyg2cHPc8YeSFnAaWpAceTcx1W_-klOGq5-CEWxvxKJrHknDLuaC2lfUylCT2wZsptSiOOqRxONgvT4LwMHp6kbuo12Qe9oUsugh9R-vcWP?purpose=fullsize)

* Stored in **heap memory**
* Variable stores **reference (address)**
* Elements are contiguous

---

## 📏 Index Rules

* Starts from **0**
* Ends at **n-1**

❌ Invalid access:

```java
arr[5]; // ArrayIndexOutOfBoundsException
```

---

## 🧮 Important Formula

```
Address of arr[i] = base + (i × size)
```

👉 Reason:

* Direct access → **O(1)**

---

## 🔁 Initialization Methods

### 1. Separate

```java
int[] arr = new int[3];
arr[0] = 10;
```

### 2. Single Line

```java
int[] arr = {10, 20, 30};
```

---

## 🔥 Key Rules (Must Remember)

* Array is **object in Java** 
* Fixed size
* Homogeneous elements
* Contiguous memory
* Fast access (O(1))

---

## 🧠 Summary

* Arrays store multiple values with same name
* Best for **fast access**
* Not good for frequent insert/delete
* Foundation for all advanced DSA

---

## ✅ What You Should Do

* Write array declaration in all forms
* Create 1D, 2D, jagged arrays
* Print and dry run memory

--- -->

#!/bin/bash

# DSA Learning Repo - Folder Scaffold Script
# Run this from the root of your cloned GitHub repo
# Usage: bash setup_dsa_repo.sh

set -e

declare -A DAYS=(
  ["day01"]="arrays"
  ["day02"]="crud-on-arrays"
  ["day03"]="array-questions"
  ["day04"]="linked-list"
  ["day05"]="crud-on-linked-list"
  ["day06"]="linked-list-questions"
  ["day07"]="stack"
  ["day08"]="crud-on-stack"
  ["day09"]="stack-questions"
  ["day10"]="queue"
  ["day11"]="crud-on-queue"
  ["day12"]="queue-questions"
  ["day13"]="trees-bst"
  ["day14"]="crud-on-bst"
  ["day15"]="tree-questions"
  ["day16"]="hashmap"
  ["day17"]="crud-on-hashmap"
  ["day18"]="hashmap-questions"
)

declare -A TITLES=(
  ["day01"]="Arrays — Introduction"
  ["day02"]="CRUD Operations on Arrays"
  ["day03"]="Array Practice Questions"
  ["day04"]="Linked List — Introduction"
  ["day05"]="CRUD Operations on Linked List"
  ["day06"]="Linked List Practice Questions"
  ["day07"]="Stack — Introduction"
  ["day08"]="CRUD Operations on Stack"
  ["day09"]="Stack Practice Questions"
  ["day10"]="Queue — Introduction"
  ["day11"]="CRUD Operations on Queue"
  ["day12"]="Queue Practice Questions"
  ["day13"]="Trees & BST — Introduction"
  ["day14"]="CRUD Operations on BST"
  ["day15"]="Tree Practice Questions"
  ["day16"]="HashMap — Introduction"
  ["day17"]="CRUD Operations on HashMap"
  ["day18"]="HashMap Practice Questions"
)

declare -A DESC=(
  ["day01"]="Understand arrays, indexing, traversal, and memory layout."
  ["day02"]="Implement Create, Read, Update and Delete operations on arrays from scratch."
  ["day03"]="Solve array-based problems (two-sum, reverse, rotate, etc.)."
  ["day04"]="Understand singly and doubly linked lists, nodes and pointers."
  ["day05"]="Implement Create, Read, Update and Delete operations on a linked list."
  ["day06"]="Solve linked list problems (reverse, detect cycle, merge, etc.)."
  ["day07"]="Understand the Stack data structure — LIFO, push, pop, peek."
  ["day08"]="Implement a Stack from scratch and all its core operations."
  ["day09"]="Solve Stack problems (balanced brackets, min stack, etc.)."
  ["day10"]="Understand the Queue data structure — FIFO, enqueue, dequeue."
  ["day11"]="Implement a Queue from scratch including circular queue."
  ["day12"]="Solve Queue problems (sliding window max, task scheduler, etc.)."
  ["day13"]="Understand Binary Trees, Binary Search Trees, and tree traversals."
  ["day14"]="Implement BST insert, search, delete, and all traversals."
  ["day15"]="Solve tree problems (height, LCA, level-order traversal, etc.)."
  ["day16"]="Understand hashing, hash functions, and collision resolution."
  ["day17"]="Implement a HashMap with put, get, remove, and resize."
  ["day18"]="Solve HashMap problems (two-sum, group anagrams, frequency count, etc.)."
)

echo "🚀 Setting up DSA learning repo structure..."
echo ""

for day in $(echo "${!DAYS[@]}" | tr ' ' '\n' | sort); do
  topic="${DAYS[$day]}"
  folder="${day}-${topic}"
  title="${TITLES[$day]}"
  desc="${DESC[$day]}"

  mkdir -p "$folder"

  cat > "$folder/README.md" <<EOF
# ${day^^} — ${title}

## Goal
${desc}

## Notes
> Write your notes, observations, and key takeaways here.

## Code
Add your implementation files in this folder alongside this README.

## Resources
- [ ] Add links to articles, videos, or documentation you found helpful.

## Status
- [ ] In progress
- [ ] Done
EOF

  echo "✅  Created: $folder/"
done

# Create root README
cat > README.md <<'EOF'
# DSA Learning Journey 🧠

A day-by-day study of Data Structures & Algorithms with CRUD implementations and practice questions.

## Structure

Each topic follows a 3-day cycle:

| Day Pattern | Focus |
|-------------|-------|
| Day N       | Concept — theory, visuals, key ideas |
| Day N+1     | CRUD — implement core operations from scratch |
| Day N+2     | Questions — solve problems using that structure |

## Topics Covered

| Days | Topic |
|------|-------|
| 01–03 | Arrays |
| 04–06 | Linked List |
| 07–09 | Stack |
| 10–12 | Queue |
| 13–15 | Trees & BST |
| 16–18 | HashMap |

## Progress Tracker

- [ ] Day 01 — Arrays
- [ ] Day 02 — CRUD on Arrays
- [ ] Day 03 — Array Questions
- [ ] Day 04 — Linked List
- [ ] Day 05 — CRUD on Linked List
- [ ] Day 06 — Linked List Questions
- [ ] Day 07 — Stack
- [ ] Day 08 — CRUD on Stack
- [ ] Day 09 — Stack Questions
- [ ] Day 10 — Queue
- [ ] Day 11 — CRUD on Queue
- [ ] Day 12 — Queue Questions
- [ ] Day 13 — Trees & BST
- [ ] Day 14 — CRUD on BST
- [ ] Day 15 — Tree Questions
- [ ] Day 16 — HashMap
- [ ] Day 17 — CRUD on HashMap
- [ ] Day 18 — HashMap Questions

---

*Consistency > Intensity. One day at a time.*
EOF

echo ""
echo "📁 Root README.md created."
echo ""
echo "✨ Done! Run the following to push to GitHub:"
echo ""
echo "   git add ."
echo "   git commit -m \"chore: scaffold DSA learning folder structure\""
echo "   git push"
echo ""