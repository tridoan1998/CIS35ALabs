################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/C---Practice/Ass2Cis22B.cpp 

OBJS += \
./src/C---Practice/Ass2Cis22B.o 

CPP_DEPS += \
./src/C---Practice/Ass2Cis22B.d 


# Each subdirectory must supply rules for building sources it contributes
src/C---Practice/%.o: ../src/C---Practice/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: Cross G++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


