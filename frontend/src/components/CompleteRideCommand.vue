<template>

    <v-card outlined>
        <v-card-title>
            CompleteRide
        </v-card-title>

        <v-card-text>
            <String label="BookingId" v-model="value.bookingId" :editMode="editMode"/>
            <String label="PaymentType" v-model="value.paymentType" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="completeRide"
            >
                CompleteRide
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CompleteRideCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.bookingId = '';
            this.value.paymentType = '';
        },
        watch: {
        },
        methods: {
            completeRide() {
                this.$emit('completeRide', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

